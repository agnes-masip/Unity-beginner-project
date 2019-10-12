using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class camhoritzontal : MonoBehaviour {
    public GameObject Detective;


    // Use this for initialization
    void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
        this.transform.position = new Vector3(Detective.transform.position.x + 0.1f, 0, -4);

    }
}
