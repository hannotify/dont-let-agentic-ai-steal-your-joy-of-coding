<!-- .slide: data-background="img/background/ai-network.jpg" data-background-color="black" data-background-opacity="0.5" -->

# New Joys in the Future <!-- .element class="stroke" -->

<https://www.pexels.com/photo/robot-pointing-on-a-wall-8386440/> <!-- .element: class="attribution" -->

note:

Timing:
* Elapsed time so far: `17m`
* Target time for current chapter: `27m`

So far I've painted a bit of a bleak picture. Wasn't this talk supposed to give you hope? Because if human involvement is expected to decrease even further, what will remain of our developer joy?

Well, buckle up, because this is where the story takes a turn. I have been working with agentic AI for some time now, and there were many moments of unexpected joyful things during that time. 

That doesn't necessarily mean that everyone would enjoy them, but I'll just list them and hopefully some of them will resonate with you as well.

---

# 1️⃣
## deterministic problems still require deterministic solutions

---

<iframe src="https://www.linkedin.com/embed/feed/update/urn:li:share:7508822010740011008?collapsed=0" height="545" width="700" frameborder="0" allowfullscreen="" title="Embedded post"></iframe>

---

## A frontier model agentic prompt that should have been a single-line regex <!-- .element: class="fragment" -->

note:

- TODO: prepare an example of changing all call sites of a method after its signature has been updated (`BigDecimal(double)` -> `BigDecimal(String)`)

and declare it a (slide)

frontier model agentic prompt that should have been a single-line Regex

---

# 2️⃣
## bye-bye boring stuff!

---

<small>

- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on coming up with test data
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on writing boilerplate code
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on writing tests for a new feature, similar to previous ones
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on writing yet another feature that follows the exact same pattern as previous ones
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on reviewing boilerplate code
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on reviewing tests for a new feature, similar to previous ones
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on reviewing yet another feature that follows the exact same pattern as previous ones
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on CSS tweaks because you want your HTML slide deck to look 'just right'
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on configuring the right Jackson annotations just to get your REST API response to look 'just right'
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on trying out JPA annotations so your entities are translated to your database in the right way
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on the right Spring incantations just to get something working
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on transitive dependency conflicts
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on debugging obscure runtime errors
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on fixing pipeline issues
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on fixing merge conflicts
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on dealing with unexpected production issues
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on handling customer support tickets related to your code
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on attending meetings on spending time more productively
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on dealing with office politics
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on managing your development environment and toolchain
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on dealing with technical debt
- &#x200B;<!-- .element class="fragment fade-up" --> spending hours on ... (you name it)

</small>

note:
Never having to deal with stuff that you found boring your entire professional life any more.
- Ranging from generating test data to doing code reviews all day to writing yet another feature that follows the exact same pattern as previous ones.

---

<!-- .slide: data-background="img/background/frustration.jpg" data-background-color="black" data-background-opacity="0.5" -->

## Spending hours on tedious, repetitive and downright boring stuff <!-- .element class="stroke" -->

<blockquote class="explanation">
Delegate it to your agents, and reclaim some of your time for more creative, meaningful and enjoyable work.
</blockquote>

<https://www.pexels.com/photo/young-annoyed-female-freelancer-using-laptop-at-home-3808008/> <!-- .element: class="attribution" -->

note:
To quickly summarise this:
Delegate all tedious, repetitive and boring tasks to your agents, and reclaim some of your time for more creative, meaningful and enjoyable work.

---

TODO

note:
Also: now you always have someone to blame when a code reviewer finds an issue. "It wasn't me, Claude did it!"

---

# 3️⃣
## strategic programming FTW

---

TODO 

note:
Leaving the _tactical programming_ to your agents means you can focus on _strategic programming_ entirely.
- *Thinking* about software instead of just *writing* it.
- Adding structure and foresight to your codebase, rather than just solving immediate problems.
- Strategic programming makes for more versatile work, and lets you build experience for future architecture roles. 
- adding a few new features gets repetitive real soon. Some developer prefer to devote their time to solving unique technical challenges.
- [Matt Pocock](https://x.com/mattpocockuk/status/2057110441864696164)

---

# 4️⃣
## trying out different roles

TODO

note:
Trying out different roles that put less emphasis on coding, such as designing, coaching, mentoring, teaching, or public speaking.
- word cloud with all work activities that I currently enjoy doing, referring to the manfred/roles-in-tech repository for further inspiration.
- mark three of them as ones that I discovered during a "Still working, honey?" evening.
 - contributing to open-source
 - creating conference talks
 - building communities like the NLJUG
- on teaching: you can show a LOT more in a live demo because of AI's multi-line suggestions (and live demos are always preferable to static content on slides).
- interestingly, these are roles that most people gravitate towards when we want to build a career in tech. AI just speeds up this process.
- in a fragment, add an additional role: 'the architect who gets their hands dirty again', from [Simons blog post](https://martinelli.ch/back-to-the-90s-the-software-engineer-has-all-the-roles-again/).

---

# 5️⃣
## setting up an autonomous dark factory seems interesting!

---

<!-- .slide: data-background="img/background/building-a-dark-factory.jpeg" data-background-color="black" data-background-opacity="0.8" -->

[image by **Willem Meints**, used with permission]() <!-- .element: class="attribution" -->

<span class="fragment">

**Herdr**: <https://herdr.dev> 

</span>

<span class="fragment">

**Jev**: <https://typesafe.ai>

</span>

note:
A lot of very interesting software engineering is still going to be needed to evolve the current agentic AI movement into autonomous dark factories:
- assigning agents the right roles (frontier model for the Architect agent, cheaper model for the Developer agents)
- configuring an agent orchestrator like Herdr (slide)
- configuring a cheap and fast classifier to decide which PR's need human review, like Jev (slide)

Also: people who know how to use Herdr and Jev.

---

### More on this topic

![Engineering Context So AI Stops Guessing](img/engineering-context-so-ai-stops-guessing.jpg) <!-- .element: width="75%" -->

<small>
<a href="https://speaking.jbaru.ch/talks/baselone-2026-context/">speaking.jbaru.ch/talks/baselone-2026-context/</a>
</small>

---

# 6️⃣
## making sustainable and social impact

TODO

note:
2 points here

Tokens will become more expensive in the future (now AI companies are losing money gaining market share, just like streaming services used to do ([penetration pricing](https://en.wikipedia.org/wiki/Penetration_pricing)), leading to more responsible use of energy and resources.

we are in the middle of a climate crisis, and the current AI boom is making it worse: directly because data centers and chip factories use up water and electricity that we would need elsewhere, and we’re switching on old, dirty power plants to satisfy the demand.

Sustainable and social impact is possible in a world with AI in it.
   - Environmentally-friendly AI exists: GreenPT, Ecosia AI, ...
   - Side-projects with potential social impact (like the app for my wife's classroom) can be completed faster, because it doesn't require much of your free time.

---

# 7️⃣
## we need good, experienced people now more than ever

---

1. <!-- .element: class="fragment" --> to prevent low-quality, vibe-coded software flooding the market
2. <!-- .element: class="fragment" --> to teach our junior colleagues the fundamentals, and to use AI without skipping the fundamentals

TODO: something about learning mode in multiple agents
TODO: something about the teach skill by Matt P.

note:
To teach our junior colleagues, and to prevent low-quality, vibe-coded software flooding the market.
   - try Claude's `outputMode=Learning` for a better learning experience
   - Matt Pocock's [teach skill](https://github.com/mattpocock/skills/blob/main/skills/productivity/teach/SKILL.md) could be helpful here.

---

# 8️⃣
## reading and understanding code is more important than ever

---

<!-- .slide: data-background="img/background/todo.jpg" data-background-color="black" data-background-opacity="0.8" -->

## Writing code may be going out of fashion <!-- .element class="stroke" -->

<blockquote class="explanation">
...but <em>reading</em> and <em>understanding</em> code is now more important than ever.
</blockquote>

<todo> <!-- .element: class="attribution" -->

---

### More on this topic

![Reading code](img/todo.jpg) <!-- .element: width="75%" -->

<small>
<a href="https://todo">todo/</a>
</small>

note:
TODO: Refer to "reading code" talk by Marit van Dijk

---

TODO: the joke "knowing where to tap"
  
---

# Or be like @BrettCodes

TODO

note:
And if all of this doesn't give you joy, you can always take a leaf from @BrettCodes' book.

