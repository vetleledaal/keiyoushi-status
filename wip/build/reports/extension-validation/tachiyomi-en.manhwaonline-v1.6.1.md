# Extension Validation Report

- Extension: tachiyomi-en.manhwaonline-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: yiimanga
- Source ID: 6460882153975501439
- Source name: ManhwaOnline
- Source language: en
- Selected manga input: popular offset 0: Even Though I’M A Former Noble And A Single Mother, My Daughters Are Too Cute And Working As An Adventurer Isn’T Too Much Of A Hassle (`.../even-though-im-a-former-noble-and-a-single-mother-my-daughters-are-too-cute-and-working-as-an-adventurer-isnt-too-much-of-a-hassle`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Even Though I’M A Former Noble And A Single Mother, My Daughters Are Too Cute And Working As An Adventurer Isn’T Too Much Of A Hassle (`.../even-though-im-a-former-noble-and-a-single-mother-my-daughters-are-too-cute-and-working-as-an-adventurer-isnt-too-much-of-a-hassle`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | I, the Sacrifice, Somehow Killed the Evil God (`.../i-the-sacrifice-somehow-killed-the-evil-god`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Return of the First Patriarch: The Strongest Reincarnates into His Descendant 1000 Years Later (`.../return-of-the-first-patriarch-the-strongest-reincarnates-into-his-descendant-1000-years-later`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | My Girlfriend Was Already Fully Trained (`.../my-girlfriend-was-already-fully-trained`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Even Though I’M A Former Noble And A Single Mother, My Daughters Are Too Cute And Working As An Adventurer Isn’T Too Much Of A Hassle (`.../detail <redacted query values: slug>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Even Though I’M A Former Noble And A Single Mother, My Daughters Are Too Cute And Working As An Adventurer Isn’T Too Much Of A Hassle (`.../even-though-im-a-former-noble-and-a-single-mother-my-daughters-are-too-cute-and-working-as-an-adventurer-isnt-too-much-of-a-hassle`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 32 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 26 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=Even Though I’M A Former Noble And A Single Mother, My Daughters Are Too Cute And Working As An Adventurer Isn’T Too Much Of A Hassle, URL=`.../detail <redacted query values: slug>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Even Though I’M A Former Noble And A Single Mother, My Daughters Are Too Cute And Working As An Adventurer Isn’T Too Much Of A Hassle, URL=`.../even-though-im-a-former-noble-and-a-single-mother-my-daughters-are-too-cute-and-working-as-an-adventurer-isnt-too-much-of-a-hassle` at page 1 offset 0 and page 2 offset 21, title=Darkened Hero: Hidden Boss Hunt, URL=`.../darkened-hero-hidden-boss-hunt` at page 1 offset 2 and page 2 offset 7, title=Level 0 Demon King Becomes a Adventurer in Another World, URL=`.../level-0-demon-king-becomes-a-adventurer-in-another-world` at page 1 offset 4 and page 2 offset 8, title=Paradox, URL=`.../paradox` at page 1 offset 7 and page 2 offset 15, title=Crazy Psycho Tale, URL=`.../crazy-psycho-tale` at page 1 offset 8 and page 2 offset 10, title=I, the Sacrifice, Somehow Killed the Evil God, URL=`.../i-the-sacrifice-somehow-killed-the-evil-god` at page 1 offset 9 and page 2 offset 0, title=A Chaste Girl’s Climax at a Nudist Beach, URL=`.../a-chaste-girls-climax-at-a-nudist-beach` at page 1 offset 11 and page 2 offset 4, title=Keloid, URL=`.../keloid` at page 1 offset 16 and page 2 offset 9, title=Room of Guilty Pleasure, URL=`.../room-of-guilty-x-pleasure` at page 1 offset 20 and page 2 offset 18, title=Love with Intention, URL=`.../love-with-intention` at page 1 offset 21 and page 2 offset 20, title=Ore wa Akutou de wa Arimasen, URL=`.../ore-wa-akutou-de-wa-arimasen` at page 1 offset 22 and page 2 offset 19 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://manhwaonline.org/.../even-though-im-a-former-noble-and-a-single-mother-my-daughters-are-too-cute-and-working-as-an-adventurer-isnt-too-much-of-a-hassle-cover.jpg` -> 2 manga URLs (examples: `.../even-though-im-a-former-noble-and-a-single-mother-my-daughters-are-too-cute-and-working-as-an-adventurer-isnt-too-much-of-a-hassle`, `.../detail <redacted query values: slug>`) |  |  |  |
| thumbnail | PASS | `https://manhwaonline.org/.../even-though-im-a-former-noble-and-a-single-mother-my-daughters-are-too-cute-and-working-as-an-adventurer-isnt-too-much-of-a-hassle-cover.jpg` (image/jpeg, 33125 bytes, 246x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../even-though-im-a-former-noble-and-a-single-mother-my-daughters-are-too-cute-and-working-as-an-adventurer-isnt-too-much-of-a-hassle` |  |  |  |
| details thumbnail URL | PASS | `https://manhwaonline.org/.../even-though-im-a-former-noble-and-a-single-mother-my-daughters-are-too-cute-and-working-as-an-adventurer-isnt-too-much-of-a-hassle-cover.jpg` |  |  |  |
| details author | PASS | Taikoban |  |  |  |
| details artist | PASS | Mura, Taikoban |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Read Manga Moto Kizoku Reijou de Mikon no Haha desuga, Musume-tachi ga Kawaisugite Boukenshagyou mo Ku ni Narimasen @COMIC/ Even Though I'm a Former Noble and a Single Mother, My Daughters Are Too Cute and Working as an Adventurer Isn't Too Much of a Hassle/ I May Be a Former Noble and Single Mother, but I Make Adventuring a Snap Since My Daughters Are So Cute!/ Moto Kizoku Reijou de Mikon no Haha desuga, Musumetachi ga Kawaii Sugite Boukenshagyo mo Ku ni Narimasen/ MotoMusu/ อดีตขุนนางสาวโสดกับชีวิตโลดโผนผจญภัยเพื่อลูกสาวสุดน่ารัก/ 元娘/ 元貴族令嬢で未婚の母ですが、娘たちが可愛すぎて冒険者業も苦になりません@COMIC/ 虽然是原贵族大小姐单身妈妈，但女儿太可爱了当冒险者也不会辛苦<br><br>---------------------<br><br>After being framed for a crime she didn't commit, a noblewoman loses her status, her reputation, and everything she once had.<br><br>Luckily, fate gives her a second chance.<br><br>Reborn as an Immortal, she gains incredible power and becomes one of the strongest adventurers in the world. Dragons, ogres, and powerful monsters all fear her name.<br><br>But behind her cool and intimidating image is a loving mother who is completely obsessed with her daughters.<br><br>While others see a legendary warrior, her daughters see someone who will do absolutely anything to make them happy. Combining epic battles, comedy, and family love, this fantasy adventure follows a mother who can defeat any monster—but can't resist spoiling her kids.<br><br>Alternative names: Moto Kizoku Reijou de Mikon no Haha desuga, Musume-tachi ga Kawaisugite Boukenshagyou mo Ku ni Narimasen @COMIC/ Even Though I'm a Former Noble and a Single Mother, My Daughters Are Too Cute and Working as an Adventurer Isn't Too Much of a Hassle/ I May Be a Former Noble and Single Mother, but I Make Adventuring a Snap Since My Daughters Are So Cute!/ Moto Kizoku Reijou de Mikon no Haha desuga, Musumetachi ga Kawaii Sugite Boukenshagyo mo Ku ni Narimasen/ MotoMusu/ อดีตขุนนางสาวโสดกับชีวิตโลดโผนผจญภัยเพื่อลูกสาวสุดน่ารัก/ 元娘/ 元貴族令嬢で未婚の母ですが、娘たちが可愛すぎて冒険者業も苦になりません@COMIC/ 虽然是原贵族大小姐单身妈妈，但女儿太可爱了当冒险者也不会辛苦 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 32 chapters |  |  |  |
| chapter dates | PASS | 32 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img03.manhwaonline.org/.../1-beb.jpg` (image/jpeg, 434199 bytes, 1440x2048) |  |  |  |
