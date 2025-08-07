const BlogDetails = (props) => {
  return (
    <div>
        <h1>blog details</h1>
      <ul>
        {props.blogs.map((blog) => (
          <div key={blog.id}>
            <h3>{blog.title}</h3>
            <h4>{blog.author}</h4>
            <h5>{blog.post}</h5>
          </div>
        ))}
      </ul>
    </div>
  );
};
export default BlogDetails;