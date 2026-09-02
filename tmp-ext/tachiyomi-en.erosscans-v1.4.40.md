# Extension Validation Report

- Extension: tachiyomi-en.erosscans-v1.4.40
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1124131000360667434
- Source name: Scythe Scans
- Source language: en
- Selected manga input: latest offset 0: Fog Land (`.../fog-land`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Hero Killer (`.../hero-killer`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | The Divine-Eyed Grimoire Mage: Jewel Saga (`.../the-divine-eyed-grimoire-mage-jewel-saga`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Fog Land (`.../fog-land`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | I Became a Mage in a Medieval Fantasy World (`.../i-became-a-mage-in-a-medieval-fantasy-world`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Fog Land (`.../fog-land`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Fog Land (`.../fog-land`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 54 | Chapter 1 (`.../fog-land-chapter-0`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Fog Land, URL=`.../fog-land` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../Nrk1w1.jpg` (image/jpeg, 113656 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../fog-land` |  |  |  |
| details thumbnail URL | PASS | `https://i0.wp.com/.../Nrk1w1.jpg` |  |  |  |
| details author | PASS | Pogo |  |  |  |
| details artist | PASS | Pogo |  |  |  |
| details genres | PASS | Action, Adventure, Demons, Monsters, Supernatural, Survival, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Fogland, a mysterious international prison, traps Dante Kang a science teacher sent to reform prisoners during a sudden riot, leaving him with only one way to escape: by becoming a leader.<br><br>Alternative Names:<br>- Kraina Mgły<br>- 포그랜드<br>- Pogeuraendeu |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 54 chapters |  |  |  |
| chapter dates | PASS | 54 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://scythescans.com/.../01-172.webp` (image/webp (encoding: lossy), 1402230 bytes, 800x8850) |  |  |  |
