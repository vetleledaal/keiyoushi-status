# Extension Validation Report

- Extension: tachiyomi-en.sirenscans-v1.6.22
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5804710058654490234
- Source name: Siren Scans
- Source language: en
- Selected manga input: popular offset 0: The Ogre's Bride (`.../the-ogre-s-bride`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | The Ogre's Bride (`.../the-ogre-s-bride`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Hiding My Identity From My Husband (`.../hiding-my-identity-from-my-husband-2`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 28 | The Ogre's Bride (`.../the-ogre-s-bride`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Ogre's Bride (`.../the-ogre-s-bride`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 30 | Chapter 1 (`.../the-ogre-s-bride-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 5 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Ogre's Bride, URL=`.../the-ogre-s-bride` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 108/108 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 108/108 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://wsrv.nl <redacted query values: url>` (image/jpeg, 251672 bytes, 1055x1406) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-ogre-s-bride` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://wsrv.nl <redacted query values: url, w, and q>` (image/jpeg, 147017 bytes, 1400x700) |  |  |  |
| details author | PASS | kureha |  |  |  |
| details artist | PASS | jun togashi |  |  |  |
| details genres | PASS | Romance, Shoujo, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Japan, where ayakashi and humans coexist in harmony. The ayakashi, with their superior abilities and beautiful appearance, sometimes find among the human women a "bride" who is destined for destiny. The bride, in return for bringing prosperity to the ayakashi, receives the absolute love of the ayakashi. Yuzuko, who has a sister who is a "bride" of a fox, is compared to her sister and is unloved by her family. One day, a man spots Yuzuko wandering the streets at night. The most beautiful man Yuzuko has ever met says she is "my bride"...? Yuzuko is loved by the most powerful and cold-hearted ayakashi...? The Japanese-style Ayakashi Cinderella story, which begins with a fateful encounter, has finally begun! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 30 chapters |  |  |  |
| chapter dates | PASS | 30 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.meowing.org/.../iOnH3_KSL8k` (image/jpeg, 1033162 bytes, 800x8533; server Content-Type: text/plain) |  |  |  |
