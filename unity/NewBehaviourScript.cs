using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class NewBehaviourScript : MonoBehaviour
{
    Rigidbody2D rb;
    Animation anim;
    float speed = 0.2f;
    bool isJumping = false;
    AudioSource mapasound;


    // Use this for initialization
    void Start()
    {
        rb = GetComponent<Rigidbody2D>();
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetKey(KeyCode.RightArrow))
        {
            if (transform.position.x < 1.423192f)
            {
                rb.velocity = new Vector2(rb.velocity.x + speed, rb.velocity.y);

                transform.localScale = new Vector3(-0.1f, 0.1f, 0.1f);

            }
            else
            {
                transform.position = new Vector3(1.423192f, transform.position.y, transform.position.z);
            }
            
        }
        if (Input.GetKey(KeyCode.LeftArrow))
        {

            rb.velocity = new Vector2(rb.velocity.x - speed, rb.velocity.y);

            transform.localScale = new Vector3(0.1f, 0.1f, 0.1f);
        }
        if (Input.GetKeyDown(KeyCode.UpArrow))
      
        {
            if (isJumping == false)
            {
                rb.AddForce(new Vector2(0.8f, 275.0f));
                isJumping = true;
            }
        }
        if (Input.GetKey(KeyCode.Escape))
        {
            
            
        }
        if (mapasound != null)
        {
            if (!mapasound.isPlaying)
            {
                mapasound.gameObject.SetActive(false);
                mapasound = null;
            }
        }
    }
    void OnTriggerEnter2D(Collider2D other)
    {
        if (other.gameObject.CompareTag("Mapa"))
        {
            mapasound = other.gameObject.GetComponent<AudioSource>();
            mapasound.Play();
            Debug.Log(other.gameObject.GetComponent<AudioSource>());
            

        }

    }
    private void OnCollisionEnter2D(Collision2D col)
    {
        isJumping = false;
    }
}
