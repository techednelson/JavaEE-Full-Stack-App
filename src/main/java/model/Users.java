package model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "users")
@NamedQueries({
        @NamedQuery(name = "users.findAll", query = "SELECT u FROM Users u")
        , @NamedQuery(name = "users.findByIdUser", query = "SELECT u FROM Users u WHERE u.id = :id")
        , @NamedQuery(name = "users.findByUsername", query = "SELECT u FROM Users u WHERE u.username = :username")
        , @NamedQuery(name = "users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password")})
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "username")
    private String username;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "password")
    private String password;

    @JoinColumn(name = "id_person", referencedColumnName = "id")
    @ManyToOne
    private Person person;

    public Users() {
    }

    public Users(Integer id) {
        this.id = id;
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Users(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Users(String username, String password, Person person) {
        this.username = username;
        this.password = password;
        this.person = person;
    }

    public Users(Integer id, String password, String username,
                   Person person) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPersona(Person person) {
        this.person = person;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "id = " + id + ", username=" + username + ", password = " + password + ", person = " + person + '}';
    }
}
