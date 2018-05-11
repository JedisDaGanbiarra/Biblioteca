-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 11-Maio-2018 às 21:41
-- Versão do servidor: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria`
--

CREATE TABLE `categoria` (
  `id` int(11) NOT NULL,
  `nome` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `editora`
--

CREATE TABLE `editora` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `emprestimo`
--

CREATE TABLE `emprestimo` (
  `id` int(11) NOT NULL,
  `dataEmprestimo` timestamp NULL DEFAULT NULL,
  `dataDevolucao` timestamp NULL DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `id_livro` int(11) DEFAULT NULL,
  `ind_devolvido` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `estoque`
--

CREATE TABLE `estoque` (
  `id` int(11) NOT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `id_livro` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro`
--

CREATE TABLE `livro` (
  `id` int(11) NOT NULL,
  `titulo` varchar(100) DEFAULT NULL,
  `autor` varchar(250) DEFAULT NULL,
  `isbn` varchar(50) DEFAULT NULL,
  `ano` int(11) DEFAULT NULL,
  `id_editora` int(11) DEFAULT NULL,
  `id_categoria` int(11) DEFAULT NULL,
  `descricao` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `telefone`
--

CREATE TABLE `telefone` (
  `id` int(11) NOT NULL,
  `numero` bigint(20) DEFAULT NULL,
  `ddd` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `matricula` bigint(50) DEFAULT NULL,
  `nome` varchar(250) DEFAULT NULL,
  `telefone` varchar(50) DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `sexo` varchar(18) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `usuario` varchar(100) DEFAULT NULL,
  `senha` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `matricula`, `nome`, `telefone`, `cpf`, `sexo`, `email`, `usuario`, `senha`) VALUES
(17, 1, 'João Lima Da Silva Neto', '88 9 9871-3063', '616.278.243-32', '0', 'jedis09122000@gmail.com', 'João Neto', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `editora`
--
ALTER TABLE `editora`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `emprestimo`
--
ALTER TABLE `emprestimo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `estoque`
--
ALTER TABLE `estoque`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `telefone`
--
ALTER TABLE `telefone`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `editora`
--
ALTER TABLE `editora`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `emprestimo`
--
ALTER TABLE `emprestimo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `estoque`
--
ALTER TABLE `estoque`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `livro`
--
ALTER TABLE `livro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `telefone`
--
ALTER TABLE `telefone`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
