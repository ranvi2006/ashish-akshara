import React from "react";

export default function VideoSection({ videos = [] }) {
  if (!videos.length) return null;

  return (
    <div className="videos">
      {videos.map((video, idx) => (
        <div key={idx} className="video-wrap">
          <video controls className="video-player">
            <source src={video} type="video/mp4" />
            Your browser does not support the video tag.
          </video>
        </div>
      ))}
    </div>
  );
}
