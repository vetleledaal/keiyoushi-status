# Extension Validation Report

- Extension: tachiyomi-all.webcomics-v1.6.11
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5830834696627804450
- Source name: Webcomics
- Source language: en
- Selected manga input: latest offset 0: Global Awakening: I Awakened Celestial Lightning (`.../6a57595062661d6f1572cd64`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | My Charm, Your Karma (`.../6765274e62661d1847781e72`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Full-Time Sword Cultivator (`.../68ea0e1862661d6d8536f78d`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | Global Awakening: I Awakened Celestial Lightning (`.../6a57595062661d6f1572cd64`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | My Giantess Legion Makes Me God (`.../6a704b7362661d55753fee52`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | Global Awakening: I Awakened Celestial Lightning (`.../6a57595062661d6f1572cd64`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Global Awakening: I Awakened Celestial Lightning (`.../6a57595062661d6f1572cd64`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 35 | Ch. 1 (`.../41a5b282b4797a07cf94fc4c`) |  | <1s |
| pages | `getPageList(chapter)` | success | 171 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Global Awakening: I Awakened Celestial Lightning, URL=`6a57595062661d6f1572cd64` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 92/92 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 92/92 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imgg-h.mangaina.com/.../h <redacted query values: ht and tw>` (image/webp (encoding: lossy), 35018 bytes, 400x533; server Content-Type: image/webp,image/gif,image/png,image/jpeg,image/jpg) |  |  |  |
| details identity | PASS | Details preserved selected URL `6a57595062661d6f1572cd64` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://imgg.mangaina.com/.../6a0f7aae05b6b9c3a024fe6cc4d9f90b.webp` (image/webp (encoding: lossy), 37144 bytes, 540x720; server Content-Type: image/png) |  |  |  |
| details author | PASS | Jinwandefengershenshixuanxiao/Fanqienovel + SESAME STUDIO |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Raiden Xu transmigrated into a world where anyone could awaken their own unique ability, yet he awakened the weakest E-Rank ability. But just as everyone thought he was destined for mediocrity, the system awakened! E-Rank Low Voltage has been upgraded to the S-Rank Celestial Fulgur! Take down monsters, farm Ability Points, and embark on an endless journey of growth and evolution! Once its limits were transcended, Raiden came to realize the bolt in his grasp was now the SSS-Rank Bolt of Chaos that could decimate the world! From an unknown E-Rank to an unparalleled powerhouse, Raiden’s legend begins here! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | PASS | 35 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 171 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://imgg.mangaina.com/.../QkFRZnBXSTdpZWwramkzOWFaeFFTZz09_b69704e12d824e6b70cd213f8b831c6f_cpImg.webp` (image/webp (encoding: lossy), 39108 bytes, 1080x900; server Content-Type: image/png) |  |  |  |
