# Extension Validation Report

- Extension: tachiyomi-en.mangahere-v1.4.24
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
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
- Source ID: 2
- Source name: Mangahere
- Source language: en
- Selected manga input: latest offset 0: Villain to Kill (`.../villain_to_kill`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 70 | Onepunch-Man (`.../onepunch_man`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 70 | Star Martial God Technique (`.../star_martial_god_technique`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 70 | Villain to Kill (`.../villain_to_kill`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 70 | Seitokai ni mo Ana wa Aru! (`.../seitokai_ni_mo_ana_wa_aru`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 12 | Villain to Kill (`.../villain_to_kill`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Villain to Kill (`.../villain_to_kill`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 266 | Ch.001 (`.../1.html`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Villain to Kill, URL=`.../villain_to_kill` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 292/292 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 292/292 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://fmcdn.mangahere.com/.../cover.jpg <redacted query values: token, ttl, and v>` (image/jpeg, 20310 bytes, 200x290) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../villain_to_kill` |  |  |  |
| details thumbnail URL | PASS | `https://fmcdn.mangahere.com/.../cover.jpg <redacted query values: token, ttl, and v>` |  |  |  |
| details author | PASS | Pupin |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Fantasy, Supernatural, Shounen, Webtoons |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “You must become the greater evil to fight against the real evil!“ Cassian dies after being framed for the murder of a comrade. Just when he thought it was all over for him, his soul is transferred into a young boy... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 266 chapters |  |  |  |
| chapter dates | PASS | 266 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://zjcdn.mangahere.org/.../r000.jpg` (image/jpeg, 202539 bytes, 1238x800) |  |  |  |
