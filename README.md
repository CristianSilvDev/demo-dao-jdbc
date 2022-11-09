#Projeto demonstrativo - Banco de Dados utilizando JDBC;

• O que é JDBC?

	Java Database Connectivity ou JDBC é um conjunto de classes e interfaces (API) escritas em Java que fazem o envio de instruções SQL para qualquer banco de dados relacional.

• Padrão de Projeto DAO (Data Access Object):

	 Para cada entidade, haverá um objeto responsável por fazer acesso a dados relacionado a esta 
	entidade. Por exemplo:
		
	o Cliente: ClienteDao
	o Produto: ProdutoDao
	o Pedido: PedidoDao
	• Cada DAO será definido por uma interface.
	• A injeção de dependência pode ser feita por meio do padrão de projeto Factory

• Classes do Projeto:

	•Department entity class
	•Seller entity class
	•DepartmentDao entity class
	•SellerDaoJDBC and DaoFactory entity class
	•Department entity class

• Implementações do Projeto:

	•findById
	•Reusing instantiation
	•findByDepartment
	•findAll
	•insert
	•update
	•delete

• Desafio proposto:
	• Implementação de DepartmentDao e os testes