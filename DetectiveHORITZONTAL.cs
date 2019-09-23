using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class DetectiveHORITZONTAL : MonoBehaviour {

    Rigidbody2D rb;
    float speed = 0.2f;
    bool isJumping = false;

    // Use this for initialization
    void Start () {

        rb = GetComponent<Rigidbody2D>();
	}
	
	// Update is called once per frame
	void Update () {
        if (Input.GetKey(KeyCode.RightArrow)) 
        {
            rb.velocity = new Vector2(rb.velocity.x + speed, rb.velocity.y);

            transform.localScale = new Vector3(-0.37f, 0.37f, 0.1f);

        }
        if (Input.GetKey(KeyCode.LeftArrow))
        {
            rb.velocity = new Vector2(rb.velocity.x - speed, rb.velocity.y);

            transform.localScale = new Vector3(0.37f, 0.37f, 0.1f);

        }
        if (Input.GetKeyDown(KeyCode.UpArrow))

        {
            if (isJumping == false)
            {
                rb.AddForce(new Vector2(5f, 350.0f));
                isJumping = true;
            }
        }
    }
    private void OnCollisionEnter2D(Collision2D col)
    {
        isJumping = false;
    }
}
