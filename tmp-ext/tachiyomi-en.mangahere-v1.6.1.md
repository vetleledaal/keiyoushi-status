# Extension Validation Report

- Extension: tachiyomi-en.mangahere-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
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
- Source ID: 2
- Source name: Mangahere
- Source language: en
- Selected manga input: popular offset 0: Onepunch-Man (`.../onepunch_man`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 70 | Onepunch-Man (`.../onepunch_man`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 70 | Star Martial God Technique (`.../star_martial_god_technique`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 70 | Reality Quest (`.../reality_quest`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 70 | Tsuuhan de Katta Youtou ga Gachi datta (`.../tsuuhan_de_katta_youtou_ga_gachi_datta`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 12 | Onepunch-Man (`.../onepunch_man`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Onepunch-Man (`.../onepunch_man`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 419 | Ch.001 - One Punch (`.../1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 10s+ |

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
| popular listing | PASS | 70 entries |  |  |  |
| latest listing | PASS | 70 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Onepunch-Man, URL=`.../onepunch_man` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Tsuuhan de Katta Youtou ga Gachi datta, URL=`.../tsuuhan_de_katta_youtou_ga_gachi_datta` at page 1 offset 68 and page 2 offset 0, title=Momoiro Meloik, URL=`.../momoiro_meloik` at page 1 offset 69 and page 2 offset 1 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 292/292 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 292/292 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://fmcdn.mangahere.com/.../cover.jpg <redacted query values: token, ttl, and v>` (image/jpeg, 18721 bytes, 200x314) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../onepunch_man` |  |  |  |
| details thumbnail URL | PASS | `https://fmcdn.mangahere.com/.../cover.jpg <redacted query values: token, ttl, and v>` |  |  |  |
| details author | PASS | ONE |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Fantasy, Supernatural, Seinen, Sci-fi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Follows the life of an average hero who manages to win all battles with only one punch. This ability seems to frustrate him as he no longer feels the thrill and adrenaline of fighting a tough battle, which leads to him questioning his past desire of being strong.After all what’s so good about having an overwhelming power? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 419 chapters |  |  |  |
| chapter dates | PASS | 419 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://zjcdn.mangahere.org/.../lopm_001_001.jpg` (image/jpeg, 87511 bytes, 860x1236) |  |  |  |
