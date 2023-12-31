package org.example.app.entities;
import jakarta.persistence.*;

    @Entity
    @Table(name = "users1")
    public class User {

        // @Id
        // Визначає первинний ключ об'єкта.
        //
        // @GeneratedValue(strategy = GenerationType.IDENTITY)
        // Для автоматичного генерування значення первинного ключа.
        // Визначає стратегію генерації значень первинних ключів.
        // GenerationType.IDENTITY вказує, що первинні ключі для сутності
        // повинні призначатися, використовуючи стовпець ідентифікації БД.
        // Вони автоматично збільшуються.
        //
        // @Column (name = "id")
        // Вказує зіставлення стовпців в БД.
        // Атрибут name використовується для вказівки імені стовпця таблиці.
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

        // Тут, найменування стовпця в БД
        // не збігається із найменуванням змінної.
        // Атрибут name вирішує проблему.
        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "phone")
        private String phone;

        @Column(name = "email")
        private String email;

        public User() {
        }

        public User(int id, String firstName, String lastName, String phone, String email) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.phone = phone;
            this.email = email;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }


