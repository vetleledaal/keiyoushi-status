# Extension Validation Report

- Extension: tachiyomi-en.wearehunger-v1.6.61
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 58992897252080929
- Source name: KokoMangas
- Source language: en
- Selected manga input: popular offset 0: Isekai Rakuraku Mujintou Life ~Class Ten’i de Craft Ability wo Eranda Ore Dake ga, Bishoujo Tachi to Slow Life wo Okureru-ppoi~ (`.../127`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Isekai Rakuraku Mujintou Life ~Class Ten’i de Craft Ability wo Eranda Ore Dake ga, Bishoujo Tachi to Slow Life wo Okureru-ppoi~ (`.../127`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Dungeon de Tatakaitsuzukete 20-nen no Doutei Yuusha, Chijou ni Modottara Danjoubi 1:1000 no Sekai Datta (`.../141`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Zombie Sekai de Harem wo Tsukurou! (`.../119`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Humanity’s Salvation Game (`.../98`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Isekai Rakuraku Mujintou Life ~Class Ten’i de Craft Ability wo Eranda Ore Dake ga, Bishoujo Tachi to Slow Life wo Okureru-ppoi~ (`.../127`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 19 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kokomangas.com/.../001.png` (image/png, 3455011 bytes, 1440x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `127` |  |  |  |
| details thumbnail URL | PASS | `https://kokomangas.com/.../001.png` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | High school student Kuno Sousuke had a strange dream. In a completely white space, there was a blackboard with the question: “If you could take just one thing to a deserted island, what would it be?” While his classmates gave sensible answers, Sousuke exclaimed, “My ability to craft items.”<br><br>When he regained consciousness, he found himself and his childhood friend transported to a deserted island in another world. And to top it all off, he’d been granted the crafting skills he’d mentioned on the blackboard! With his crafting skills, Sousuke easily adapts to the harsh life on the island! Surrounded by a calm and serene childhood friend, a kind girl, a dazzling beauty, and a serious class president, his days are comfortable and pleasant. “Sou-kun, in this situation, a harem is only natural.” “You can feel as good as you want.” |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | PASS | 19 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://kokomangas.com/.../1.webp` (image/webp (encoding: lossy), 114382 bytes, 650x924) |  |  |  |
