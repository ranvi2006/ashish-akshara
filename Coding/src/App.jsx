import React, { useState } from "react";
import Landing from "./components/Landing.jsx";
import WishMessage from "./components/WishMessage.jsx";
import "./App.css";

export default function App() {
  const [opened, setOpened] = useState(false);

  return (
    <div className="App">
           <video autoPlay loop muted playsInline className="background-video">
        <source src="/videos/sky-stars.mp4" type="video/mp4" />
      </video>

      {!opened ? (
        <Landing onOpen={() => setOpened(true)} />
      ) : (
        <WishMessage
          name="Akshara"
          message="You make my world brighter every day. I’m lucky to have you ❤️"
          images={["/images/1.jpg", "/images/2.jpg"]}
          videos={["/videos/video1.mp4", "/videos/video2.mp4"]}
          music="/music/romantic.mp3"
        />
      )}
    </div>
  );
}
