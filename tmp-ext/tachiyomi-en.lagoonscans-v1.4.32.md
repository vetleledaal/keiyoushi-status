# Extension Validation Report

- Extension: tachiyomi-en.lagoonscans-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7925933833035450162
- Source name: Lagoon Scans
- Source language: en
- Selected manga input: latest offset 0: The Tale of Cultivation and Demon Extermination (`.../the-tale-of-cultivation-and-demon-extermination`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | The Regressed Mercenary’s Machinations (`.../the-regressed-mercenarys-machinations`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Revenge of the Iron-Blooded Sword Hound (`.../revenge-of-the-iron-blooded-sword-hound`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | The Tale of Cultivation and Demon Extermination (`.../the-tale-of-cultivation-and-demon-extermination`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Shadow Slave (`.../shadow-slave`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Tale of Cultivation and Demon Extermination (`.../the-tale-of-cultivation-and-demon-extermination`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Tale of Cultivation and Demon Extermination (`.../the-tale-of-cultivation-and-demon-extermination`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 12 | Chapter 1 (`.../the-tale-of-cultivation-and-demon-extermination-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Tale of Cultivation and Demon Extermination, URL=`.../the-tale-of-cultivation-and-demon-extermination` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../7y0rwJ-m.jpg <redacted query values: resize>` (image/jpeg, 23345 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-tale-of-cultivation-and-demon-extermination` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i1.wp.com/.../7y0rwJ-m.jpg` (image/jpeg, 195718 bytes, 1024x1484) |  |  |  |
| details author | PASS | LEE Sanchaek, Yeon Woo Sol |  |  |  |
| details artist | PASS | Salt Dog |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Historical, Martial arts, Seinen, Supernatural, Tragedy, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | After cruelly executing the wicked ghosts that killed his parents, a young boy named Lee-se is branded as a monster by his village. Having lost all attachment to life, Lee-se meets Mong-ryeon, a goblin and ghost hunter, and adopts a new goal: to exterminate all ghosts from the world. As they begin living together, Mong-ryeon discovers a unique trait in Lee-se and sends him to ‘Daemudo,’ a cultivation sect known as the executioners of the cultivation world.<br><br>Alternative Names: 멸귀수도전 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://lagoonscans.com/.../01-104.webp` (image/webp (encoding: lossy), 586678 bytes, 800x13000) |  |  |  |
