import React from "react";
import ProfilePic from "../Assets/8.svg";
import { AiFillStar } from "react-icons/ai";
import '../Testimonial/Testimonial.css';
const Testimonial = () => {
  return (
    <div className="work-section-wrapper">
      <div className="work-section-top">
        <p className="primary-subheading"></p>
        <h1 className="primary-heading">What They Are Saying</h1>
        <p className="primary-text">
        "Hear It from Our Stars!" ,At JobSymphony, we let our user's voices shine like constellations in the night sky. Check out our 'what they are Saying' section, where real stories of career transformations and triumphs light up the universe. Your success is our brightest star! 
        </p>
      </div>
      <div className="testimonial-section-bottom">
        <img src={ProfilePic} alt="" />
        <p>
       Thanks to JobSymphony, I'm now on the path to a fulfilling career. If you're serious about your job search, don't miss out on this incredible tool!

        </p>
        <div className="testimonials-stars-container">
          <AiFillStar />
          <AiFillStar />
          <AiFillStar />
          <AiFillStar />
          <AiFillStar />
        </div>
        <h2>SUDHA</h2>
      </div>
    </div>
  );
};

export default Testimonial;