import React from "react";

export default function Landing({ onOpen }) {
  return (
    <div className="landing">
      <div className="landing-card">
        <h1>💝 A Special Surprise 💝</h1>
        <p className="sub">Click to open your message</p>
        <button className="open-btn" onClick={onOpen}>
          Open
        </button>
      </div>
    </div>
  );
}
