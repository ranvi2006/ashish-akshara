import React from "react";
import PhotoSlideshow from "./PhotoSlideshow.jsx";
import VideoSection from "./VideoSection.jsx";
import MusicPlayer from "./MusicPlayer.jsx";

export default function WishMessage({ name, message, images, videos, music }) {
  return (
    <div className="wish">
      <MusicPlayer src={music} />
      <div className="wish-card">
        <span style={{position:"relative",left:"-100px",color:"black",}}>
            <img src="/images/ballon.png" alt="" style={{height:"50px"}} />
        </span>
        <span style={{position:"relative",right:"-100px",color:"black"}}>
            <img src="/images/ballon.png" alt="" style={{height:"50px"}} />
        </span>
        <h1>Happy BirthDay, {name} ❤️</h1>
        <p className="wish-text">{message}</p>
        <p style={{fontWeight:"bold",color:"darkred",fontFamily:"monospace"}}>From : Ashish kumar mandal</p>

        <PhotoSlideshow images={images} />

        <VideoSection videos={videos} />
      </div>
    </div>
  );
}
