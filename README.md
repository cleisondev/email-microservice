# Service Name - AWS SES Microservice

## Descrição
Este microsserviço foi desenvolvido em Java e tem como objetivo o envio de e-mails transacionais utilizando o Amazon Simple Email Service (SES). Ele segue uma arquitetura baseada em microsserviços e pode ser facilmente integrado a outras aplicações.

## Tecnologias Utilizadas
- Java (versão X)
- Spring Boot
- AWS SDK para Java
- Amazon SES
- Banco de Dados em memória (H2)

## Requisitos
Antes de executar a aplicação, certifique-se de ter:
- Uma conta AWS com o SES configurado
- Chaves de acesso AWS (`AWS_ACCESS_KEY_ID` e `AWS_SECRET_ACCESS_KEY`)
- Java e Maven instalados

## Configuração

### Configuração no `application.properties`
Se preferir, configure diretamente no `application.properties` ou `application.yml`:

```properties
aws.access-key=${AWS_ACCESS_KEY_ID}
aws.secret-key=${AWS_SECRET_ACCESS_KEY}
aws.region=${AWS_REGION}

# Configuração do banco de dados em memória
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

## Execução

### Compilar e Executar

```bash
mvn clean install
java -jar target/aws-ses-microservice.jar
```
## Endpoints

### Enviar E-mail

**POST** `/api/email/send`

**Payload:**
```json
{
  "to": "destinatario@example.com",
  "subject": "Assunto do E-mail",
  "body": "Corpo do e-mail"
}
```

**Resposta:**
```json
{
  "message": "E-mail enviado com sucesso!"
}
```
