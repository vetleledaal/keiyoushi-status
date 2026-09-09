# Extension Validation Report

- Extension: tachiyomi-en.bookwalker-v1.4.7
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2744810059574599668
- Source name: BookWalker
- Source language: en
- Selected manga input: popular offset 0: Kaiju No. 8 (`.../kaiju-no-8`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 59 | Kaiju No. 8 (`.../kaiju-no-8`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 60 | Highschool of the Dead (Color Edition) (`.../highschool-of-the-dead-color-edition`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 51 | Heavenly Swords of the Twin Stars (`.../heavenly-swords-of-the-twin-stars`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 56 | My Stoic Boyfriend Is Actually a Massive Perv! (`.../my-stoic-boyfriend-is-actually-a-massive-perv`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | Kaiju No. 8 (`.../kaiju-no-8`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Kaiju No. 8 (`.../kaiju-no-8`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 16 | Volume 1 💵 (`.../kaiju-no-8-vol-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| popular listing | PASS | 59 entries |  |  |  |
| latest listing | PASS | 51 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kaiju No. 8, URL=`.../kaiju-no-8` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 229/229 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 222/229 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.sos-dan.net/.../EXA1PKQNZ9CG1AB8PV6EZ.webp` (image/webp (container: extended), 60368 bytes, 480x720) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kaiju-no-8` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://img.sos-dan.net/.../EXA1PKQNZ9CG1AB8PV6EZ.webp` (image/webp (container: extended), 117168 bytes, 800x1200) |  |  |  |
| details author | PASS | Naoya Matsumoto |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Comedy, Fantasy, Action, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kafka hopes to one day keep his pact with his childhood friend Mina to join the Japan Defense Force and fight by her side. But while she's out neutralizing kaiju as Third Division captain, Kafka is stuck cleaning up the aftermath of her battles. When a sudden rule change makes Kafka eligible for the Defense Force, he decides to try out for the squad once more. There's just one problem—he's made the Defense Force's neutralization list under the code name Kaiju No. 8. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 16 chapters |  |  |  |
| chapter dates | PASS | 16 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://flame.sos-dan.net/.../0.webp <redacted query values: clientid and token>` (image/webp (encoding: lossy), 334588 bytes, 1365x2048) |  |  |  |
