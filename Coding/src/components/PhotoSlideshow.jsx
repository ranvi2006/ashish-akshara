import React, { useState, useEffect } from "react";

export default function PhotoSlideshow({ images = [] }) {
  const [index, setIndex] = useState(0);

  useEffect(() => {
    if (!images.length) return;
    const interval = setInterval(() => {
      setIndex((i) => (i + 1) % images.length);
    }, 3000);
    return () => clearInterval(interval);
  }, [images]);

  if (!images.length) return null;

  return (
    <div className="slideshow-wrap">
      <img src={images[index]} alt="memories" className="slideshow" />
    </div>
  );
}
