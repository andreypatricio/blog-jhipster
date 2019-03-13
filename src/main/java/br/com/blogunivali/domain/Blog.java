package br.com.blogunivali.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Blog.
 */
@Document(collection = "blog")
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    private String id;

    @Field("blog_name")
    private String blogName;

    @Field("description")
    private String description;

    @Field("user_admin")
    private String userAdmin;

    @DBRef
    @Field("post")
    private Set<Post> posts = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBlogName() {
        return blogName;
    }

    public Blog blogName(String blogName) {
        this.blogName = blogName;
        return this;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public String getDescription() {
        return description;
    }

    public Blog description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserAdmin() {
        return userAdmin;
    }

    public Blog userAdmin(String userAdmin) {
        this.userAdmin = userAdmin;
        return this;
    }

    public void setUserAdmin(String userAdmin) {
        this.userAdmin = userAdmin;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public Blog posts(Set<Post> posts) {
        this.posts = posts;
        return this;
    }

    public Blog addPost(Post post) {
        this.posts.add(post);
        post.setBlog(this);
        return this;
    }

    public Blog removePost(Post post) {
        this.posts.remove(post);
        post.setBlog(null);
        return this;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Blog blog = (Blog) o;
        if (blog.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), blog.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Blog{" +
            "id=" + getId() +
            ", blogName='" + getBlogName() + "'" +
            ", description='" + getDescription() + "'" +
            ", userAdmin='" + getUserAdmin() + "'" +
            "}";
    }
}
