<!-- .slide: data-background="img/background/ai-network.jpg" data-background-color="black" data-background-opacity="0.5" -->

# Lost Joys from the Past <!-- .element class="stroke" -->
### (and why this time it's different) <!-- .element class="stroke fragment" -->

<https://www.pexels.com/photo/robot-pointing-on-a-wall-8386440/> <!-- .element: class="attribution" -->

note:

Timing:
* Elapsed time so far: `12m`
* Target time for current chapter: `17m`

Or perhaps I'm overreacting here? 
Goodness knows our field has seen *a lot* of changes in the past, right?
And we're still here, enjoying our jobs, right? [wait for audience reaction]
[if poor reaction] You're thinking too much of code reviews right now. "LGTM", "LGTM", no-one would want to do that all day.

But (slide) I think this time it's different.

---

<!-- .slide: data-auto-animate" -->

### We went from...

<pre data-id="assembly-to-java"><code class="assembly" data-trim data-line-numbers>
ORG 0x0000

START_OF_MEMORY  EQU 0x1000
NUMBER_OF_ELEMENTS EQU 5
CURRENT_ITERATION EQU 0

BUBBLE_SORT:
OUTER_LOOP:
        LD C, 0                   
        LD B, NUMBER_OF_ELEMENTS - 1
        LD A, B
        SUB H
        LD B, A
        LD IX, START_OF_MEMORY

INNER_LOOP:
        LD A, (IX)
        LD D, (IX+1)
        CP D
        JP C, NO_SWAP
        CALL SWAP_SUBROUTINE

NO_SWAP:
        INC IX
        DEC B
        JP NZ, INNER_LOOP

        LD A, C
        OR A
        JP NZ, CONTINUE_OUTER_LOOP

        JP HALT_PROGRAM

CONTINUE_OUTER_LOOP:
    INC H
    JP OUTER_LOOP
    
SWAP_SUBROUTINE:
    LD (IX), D
    LD (IX+1), A
    LD C, 1 
    RET

HALT_PROGRAM:
        HALT

        ORG START_OF_MEMORY
        DB   1,60,30,10,99
</code></pre>

note:
Bubble Sort in Assembly.

---

<!-- .slide: data-auto-animate" -->

### to...

<pre data-id="assembly-to-java"><code class="java" data-trim data-line-numbers>
void bubbleSort(Integer[] arr) {
    int length = arr.length;
    IntStream.range(0, length - 1)
        .flatMap(i -> IntStream.range(1, length - i))
        .forEach(j -> {
            if (arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
         });
}
</code></pre>

note:
...and did we hate this new way of creating software?
I'm going to assume "No" here, as we *literally* find ourselves at a Java conference right now.

---

<!-- .slide: data-background-color="black" -->

### We went from...

![Turbo Pascal Manual](img/turbo-pascal-manual.jpg) <!-- .element: width="65%" -->

<https://www.excesssolutions.com/listings/8408307-used-lot-of-vintage-borland-software-and-manuals-turbo-c-turbo-pascal-paradox#&gid=1&pid=18> <!-- .element: class="attribution" -->

---

<!-- .slide: data-background-color="black" -->

### to...

![StackOverflow Home Page](img/stackoverflow-homepage.avif) <!-- .element: width="65%" -->

<https://www.makeuseof.com/tag/10-websites-geeks-stripes-bookmark/> <!-- .element: class="attribution" -->

note:
...and did we hate this new way of creating software?
Any thoughts?
Personally I would hate to spend all that time going through thick manuals like that.

---

<!-- .slide: data-auto-animate" -->

### We went from...

<pre data-id="imperative-to-declarative"><code class="java" data-trim data-line-numbers>
public String fetchDataFromRemote() {
    new Thread(() -> {
        int attempts = 0;
        while (attempts < 3) {
            try {
                return remote.fetchData();
            } catch (RemoteException e) {
                attempts++;
            }
        }
        throw new Exception("Failed after 3 attempts");
    }).start();
}
</code></pre>

---

<!-- .slide: data-auto-animate" -->

### to...

<pre data-id="imperative-to-declarative"><code class="java" data-trim data-line-numbers>
@Async
@Retryable(retryFor = RemoteException.class, maxAttempts = 3)
public String fetchDataFromRemote() {
    return remote.fetchData();
}
</code></pre>

note:
...and did we hate this new way of creating software?
Any thoughts?
As a trainer, I actually loved this change. Because it allowed us to create a Spring course that I could teach.

---

## Can we also go from... <!-- .element class="fragment" -->
 
doing all the work ourselves <!-- .element class="fragment" -->

## to... <!-- .element class="fragment" -->

having AI agents handle everything autonomously <!-- .element class="fragment" -->

## ...and still enjoy ourselves? 🤔 <!-- .element class="fragment" -->

note:
So you could argue that most of our developer joy has remained throughout these changes.
Which leads us to the million-dollar question: (slide x5)

Isn't the answer simply "Yes"?

---

### Well, this time it seems to be different

* &#x200B;<!-- .element class="fragment" --> things are changing *much faster* than before
* &#x200B;<!-- .element class="fragment" --> the effects of the changes are *much bigger* than before

note:
*much faster*
- the change rate of agentic AI is insane. It's at JavaScript framework level: every week things are different. It's so much harder to get used to the new situation than before.

*much bigger*
- previous changes were on operational level–they changed a small part of our daily work.
- these changes are at strategic level–they change a large part of our daily work.

---

<!-- .slide: data-background="img/background/building-a-dark-factory.jpeg" data-background-color="black" data-background-opacity="0.8" -->

[image by **Willem Meints**, used with permission]() <!-- .element: class="attribution" -->

note:
And this is emphasised even more in the latest trend that the agentic revolution has given us: dark factories. Facilities that deliver software, from inception to production with little or no human presence on the floor.

---

<!-- .slide: data-background="img/background/drinking-coffee-in-a-dark-factory.jpeg" data-background-color="black" data-background-opacity="0.8" -->

## The major difference with earlier technological shifts <!-- .element class="stroke" -->

<blockquote class="explanation">
Almost no human involvement on the operational level.
</blockquote>

[image by **Willem Meints**, used with permission]() <!-- .element: class="attribution" -->

note:
And we can expect human involvement to decrease even further when dark factories mature.
