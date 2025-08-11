import React, { useRef, useEffect } from "react";

export default function MusicPlayer({ src }) {
  const audioRef = useRef(null);

  useEffect(() => {
    // play on user action (the Landing "Open" click triggers render of WishMessage)
    const playPromise = audioRef.current?.play();
    if (playPromise !== undefined) {
      playPromise.catch(() => {
        // autoplay may be blocked by browser — user can press play on the controls if needed
      });
    }
  }, []);

  return (
    <audio ref={audioRef} src={src} loop controls style={{ display: "none" }} />
  );
}
