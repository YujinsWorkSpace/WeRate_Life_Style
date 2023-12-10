package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.core.model.ModelIdentifier;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the UserComment type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "UserComments", type = Model.Type.USER, version = 1)
@Index(name = "byComment", fields = {"commentId"})
@Index(name = "byUser", fields = {"userId"})
public final class UserComment implements Model {
  public static final QueryField ID = field("UserComment", "id");
  public static final QueryField COMMENT = field("UserComment", "commentId");
  public static final QueryField USER = field("UserComment", "userId");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="Comment", isRequired = true) @BelongsTo(targetName = "commentId", targetNames = {"commentId"}, type = Comment.class) Comment comment;
  private final @ModelField(targetType="User", isRequired = true) @BelongsTo(targetName = "userId", targetNames = {"userId"}, type = User.class) User user;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  /** @deprecated This API is internal to Amplify and should not be used. */
  @Deprecated
   public String resolveIdentifier() {
    return id;
  }
  
  public String getId() {
      return id;
  }
  
  public Comment getComment() {
      return comment;
  }
  
  public User getUser() {
      return user;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private UserComment(String id, Comment comment, User user) {
    this.id = id;
    this.comment = comment;
    this.user = user;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      UserComment userComment = (UserComment) obj;
      return ObjectsCompat.equals(getId(), userComment.getId()) &&
              ObjectsCompat.equals(getComment(), userComment.getComment()) &&
              ObjectsCompat.equals(getUser(), userComment.getUser()) &&
              ObjectsCompat.equals(getCreatedAt(), userComment.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), userComment.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getComment())
      .append(getUser())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("UserComment {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("comment=" + String.valueOf(getComment()) + ", ")
      .append("user=" + String.valueOf(getUser()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static CommentStep builder() {
      return new Builder();
  }
  
  /**
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static UserComment justId(String id) {
    return new UserComment(
      id,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      comment,
      user);
  }
  public interface CommentStep {
    UserStep comment(Comment comment);
  }
  

  public interface UserStep {
    BuildStep user(User user);
  }
  

  public interface BuildStep {
    UserComment build();
    BuildStep id(String id);
  }
  

  public static class Builder implements CommentStep, UserStep, BuildStep {
    private String id;
    private Comment comment;
    private User user;
    @Override
     public UserComment build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new UserComment(
          id,
          comment,
          user);
    }
    
    @Override
     public UserStep comment(Comment comment) {
        Objects.requireNonNull(comment);
        this.comment = comment;
        return this;
    }
    
    @Override
     public BuildStep user(User user) {
        Objects.requireNonNull(user);
        this.user = user;
        return this;
    }
    
    /**
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(String id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, Comment comment, User user) {
      super.id(id);
      super.comment(comment)
        .user(user);
    }
    
    @Override
     public CopyOfBuilder comment(Comment comment) {
      return (CopyOfBuilder) super.comment(comment);
    }
    
    @Override
     public CopyOfBuilder user(User user) {
      return (CopyOfBuilder) super.user(user);
    }
  }
  

  public static class UserCommentIdentifier extends ModelIdentifier<UserComment> {
    private static final long serialVersionUID = 1L;
    public UserCommentIdentifier(String id) {
      super(id);
    }
  }
  
}
