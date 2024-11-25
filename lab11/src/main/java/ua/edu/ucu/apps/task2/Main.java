package ua.edu.ucu.apps.task2;

public class Main {
    public static void main(String[] args) {
        Client client = Client.builder()
            .name("John")
            .age(20)
            .email("test@client.mail")
            .build();
        


        MailInfo mailInfo = new MailInfo(client, client1 -> "It is just a random mail!");

        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);
    }
}