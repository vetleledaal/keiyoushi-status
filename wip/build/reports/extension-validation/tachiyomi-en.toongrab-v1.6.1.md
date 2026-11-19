# Extension Validation Report

- Extension: tachiyomi-en.toongrab-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2047317004215433863
- Source name: ToonGrab
- Source language: en
- Selected manga input: popular offset 0: God of Martial Arts (`.../god-of-martial-arts`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | God of Martial Arts (`.../god-of-martial-arts`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Ian the Illegitimate Son Was an Emperor (`.../ian-the-illegitimate-son-was-an-emperor`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Former Supreme (`.../the-former-supreme`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Past Life Returner (`.../past-life-returner`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Star Martial God Technique (`.../star-martial-god-technique`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | God of Martial Arts (`.../god-of-martial-arts`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1257 | Chapter 1 (`.../chapter-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 9 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 2: title=God of Martial Arts, URL=`god-of-martial-arts` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 99/99 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 99/99 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.toongrab.com/.../god-of-martial-arts-1787749748178.webp` (image/webp (encoding: lossy), 310812 bytes, 1086x1448) |  |  |  |
| details identity | PASS | Details preserved selected URL `god-of-martial-arts` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.toongrab.com/.../god-of-martial-arts-1787749748178.webp` |  |  |  |
| details author | PASS | Juéshì Wǔshén |  |  |  |
| details artist | PASS | Yunduowudongman |  |  |  |
| details genres | PASS | Action, Drama, Fantasy, Isekai, Romance, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | God of Martial Arts is an epic cultivation manhua following Lin Feng's rise from a despised outcast to a peerless sovereign. Awakening the supreme Heavenly Tome Martial Spirit, he gains the terrifying ability to devour defeated souls and master infinite elemental affinities. Follow his blood-soaked, defiant ascent to conquer the Eight Desolate Regions in this ruthless martial arts saga. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 80 name |  |  |  |
| chapters | PASS | 1257 chapters |  |  |  |
| chapter dates | PASS | 1257 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.toongrab.com/.../god-of-martial-arts-1782491079363.webp <redacted query values: uid, exp, and sig>` (image/webp (encoding: lossy), 251442 bytes, 1536x1024) |  |  |  |
