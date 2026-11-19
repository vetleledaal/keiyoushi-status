# Extension Validation Report

- Extension: tachiyomi-en.philiascans-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5404809838386240671
- Source name: Philia Scans
- Source language: en
- Selected manga input: popular offset 0: The Reincarnated Girl Wants to Start from the Very First Step (`.../the-reincarnated-girl-wants-to-start-from-the-very-first-step`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Reincarnated Girl Wants to Start from the Very First Step (`.../the-reincarnated-girl-wants-to-start-from-the-very-first-step`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | When I Tried to Conquer the School Princesses, It Turned Into Romantic Mayhem (`.../when-i-tried-to-conquer-the-school-princesses-it-turned-into-romantic-mayhem`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | I Don't Want to Be a Vengeful Princess, so I'm Dumping Everything on the Villains (`.../i-dont-want-to-be-a-vengeful-princess-so-im-dumping-everything-on-the-villains`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The Villainess Conquers Everything with Her Fists (`.../the-villainess-conquers-everything-with-her-fists`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | How My Stand-In Marriage to a Frontier Lord Turned into a Delicious Slow Life (`.../how-my-stand-in-marriage-to-a-frontier-lord-turned-into-a-delicious-slow-life`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Reincarnated Girl Wants to Start from the Very First Step (`.../the-reincarnated-girl-wants-to-start-from-the-very-first-step`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 54 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 53 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 2: title=The Reincarnated Girl Wants to Start from the Very First Step, URL=`the-reincarnated-girl-wants-to-start-from-the-very-first-step` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=My Five Stepsisters, URL=`my-five-stepsisters` at page 1 offset 19 and page 2 offset 19 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 84/84 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 84/84 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://philiascans.org/.../4c828b25decc2d6444ec78a0c0e2cdbcfa561fca0c6aee5d560f01e68c672256.webp <redacted query values: token, expires, and v>` (image/webp (encoding: lossy), 113946 bytes, 703x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-reincarnated-girl-wants-to-start-from-the-very-first-step` |  |  |  |
| details thumbnail URL | PASS | `https://philiascans.org/.../4c828b25decc2d6444ec78a0c0e2cdbcfa561fca0c6aee5d560f01e68c672256.webp <redacted query values: token, expires, and v>` |  |  |  |
| details author | PASS | Kaya |  |  |  |
| details artist | PASS | Naru, Okamura Ayumu |  |  |  |
| details genres | PASS | Adventure, Fantasy, Isekai, Magic, Monsters, Shoujo, Slice of Life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ichinokura Sarasa had always suffered from a weak constitution that left her constantly exhausted. Even so, she managed to find a job and work hard. But in the end, she collapsed, and when she came to, she found herself in the room of a goddess from another world. You have a body that requires magical power, but you were born on Earth, where none exists. Shocked by the goddess’s words, Sarasa learns that her body actually needs magic to function properly. To save her, the goddess decides to reincarnate her into another world, Trilgaea! Now reborn as a ten-year-old girl and freed from her frailty, Sarasa is ready to embrace a new, hope-filled life. However, she soon discovers she’s been dropped into a mountain teeming with monsters, where even stepping outside is dangerous! And so begins Sarasa’s slow life in another world, starting with her struggle just to set foot outside.<br><br>https://www.cmoa.jp/.../233196<br><br>Alternative Titles:<br>- Tensei Shoujo wa Mazu Ippo kara Hajimetai: Mamono ga Iru Toka Kiitenai!<br>- 転生少女はまず一歩からはじめたい～魔物がいるとか聞いてない！～ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 54 chapters |  |  |  |
| chapter dates | PASS | 54 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://philiascans.org/.../267562380c5a09b415bc501d454493a9b0eb5eb8055561af13889680b48f5be9_s.webp <redacted query values: token, expires, and v>` (image/webp (encoding: lossy), 423168 bytes, 1350x1920) |  |  |  |
