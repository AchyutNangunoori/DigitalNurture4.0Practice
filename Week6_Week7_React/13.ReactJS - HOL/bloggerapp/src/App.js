import './App.css';
import BlogDetails from './Blog';
import BookDetails from './Book';
import CourseDetails from './Course';
import { useState } from 'react';
function App() {
  const books=[
    { id: 1, bname: "React Explained", price: "250" },
    { id: 2, bname: "Mastering Redux", price: "300" },
    { id: 3, bname: "TypeScript for Pros", price: "280" }
  ];
  const blogs = [
  {
    id: 1,
    title: "React Basics",
    author: "abc",
    post: "Intro to components, props, and state."
  },
  {
    id: 2,
    title: "JSX Tips",
    author: "def",
    post: "How to write clean and readable JSX."
  }
];
const courses = [
  {
    id: 1,
    cname: "React Fundamentals",
    date: "2025-09-10"
  },
  {
    id: 2,
    cname: "Advanced JavaScript",
    date: "2025-10-01"
  }
];

const [showBook, setShowBook] = useState(true);
const [showBlog, setShowBlog] = useState(true);
const [showCourse, setShowCourse] = useState(true);
let BookContent;
if(showBook===true){
  BookContent=<BookDetails books={books} />;
} 
let BlogContent;
switch (showBlog) {
  case true:
    BlogContent=<BlogDetails blogs={blogs} />;
    break;
  default:
    BlogContent=null;
}
let CourseContent=showCourse===true?<CourseDetails courses={courses}/>:null;
  return (
    <div className="App">
      {BookContent}
      {BlogContent}
      {CourseContent}
      
    </div>
  );
}

export default App;
