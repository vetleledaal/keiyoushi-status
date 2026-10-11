# Extension Validation Report

- Extension: tachiyomi-en.arenascans-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source theme: mangathemesia
- Source ID: 8861274191478178487
- Source name: Arena Scans
- Source language: en
- Selected manga input: latest offset 0: Return of the Legendary Spear Knight (`.../return-of-the-legendary-spear-knight`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | How to Get My Husband on My Side (`.../how-to-get-my-husband-on-my-side`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Only for Love (`.../only-for-love`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Return of the Legendary Spear Knight (`.../return-of-the-legendary-spear-knight`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Worthless Profession: Dragon Tamer (`.../worthless-profession-dragon-tamer`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Return of the Legendary Spear Knight (`.../return-of-the-legendary-spear-knight`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Return of the Legendary Spear Knight (`.../return-of-the-legendary-spear-knight`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 222 | Chapter 1 (`.../return-of-the-legendary-spear-knight-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Return of the Legendary Spear Knight, URL=`.../return-of-the-legendary-spear-knight` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://arenascan.com/.../41932bb3-4cff-4e51-ba7b-897d311629bf.jpg` (image/jpeg, 229124 bytes, 720x1053) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../return-of-the-legendary-spear-knight` |  |  |  |
| details thumbnail URL | PASS | `https://arenascan.com/.../41932bb3-4cff-4e51-ba7b-897d311629bf.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Manhwa, Manhwa |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Read manhwa Unrivaled Spear Knight / Return of the Legendary Spear Knight / 역대급 창기사의 회귀 The stereotype that knights must use swords is broken by the brightest star of a duke’s family. The hero that brought an end to the empire’s civil war. The name of that person is Joshua Sanders. Despite his reputation of being called the empire’s unrivaled spear, he was bleeding dark red blood. Not just anyone but by the hand of his own emperor, Kaiser… “Kaiser! Don’t think it will end like this!!” Moments before death, incurred by magic circle, the spear that spent its years together with him, ‘Lugia’, started to emit an enormous amount of energy… This familiar place, it can’t be… the stable that I used to live in when I was young? My body became young?! Lugia, what the hell are you? Joshua returned to his younger self. His ultimate revenge starts here!<br><br>Alternative Names: <br>- Return of the Legendary Spear Knight<br>- 역대급 창기사의 회귀 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 222 chapters |  |  |  |
| chapter dates | PASS | 222 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.arenascan.com/.../001.jpg` (image/png, 206321 bytes, 1000x563; server Content-Type: image/jpeg) |  |  |  |
