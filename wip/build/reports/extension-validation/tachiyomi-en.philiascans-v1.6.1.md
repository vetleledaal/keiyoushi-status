# Extension Validation Report

- Extension: tachiyomi-en.philiascans-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: Even a Parakeet Wants to Experience Youth (`.../even-a-parakeet-wants-to-experience-youth`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Even a Parakeet Wants to Experience Youth (`.../even-a-parakeet-wants-to-experience-youth`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Magical Machina: The Broken Hero's Revenge (`.../magimech-the-broken-heros-revenge`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | The Gray World is Colored by the Eyes of God: From Weakest to Strongest with Status That Only I Can See (`.../the-gray-world-is-colored-by-the-eyes-of-god-from-weakest-to-strongest-with-status-that-only-i-can-see`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | The Strongest Sage with 0 Magic Power (`.../the-strongest-sage-with-0-magic-power`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Even a Parakeet Wants to Experience Youth (`.../even-a-parakeet-wants-to-experience-youth`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Even a Parakeet Wants to Experience Youth (`.../even-a-parakeet-wants-to-experience-youth`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 28 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Even a Parakeet Wants to Experience Youth, URL=`even-a-parakeet-wants-to-experience-youth` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=I Swapped Bodies with the Hated Witch, but I'm Living My Best Life!, URL=`i-swapped-bodies-with-the-hated-witch-but-im-living-my-best-life` at page 1 offset 19 and page 2 offset 19 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://philiascans.org/.../375e28c98e67c25da1dc11905deab6abb902e6249f5403030489c7cfb9dc27c2.webp <redacted query values: token, expires, and v>` (image/webp (container: extended), 485812 bytes, 1688x2400) |  |  |  |
| details identity | PASS | Details preserved selected URL `even-a-parakeet-wants-to-experience-youth` |  |  |  |
| details thumbnail URL | PASS | `https://philiascans.org/.../375e28c98e67c25da1dc11905deab6abb902e6249f5403030489c7cfb9dc27c2.webp <redacted query values: token, expires, and v>` |  |  |  |
| details author | PASS | Yamada Gomachi |  |  |  |
| details artist | PASS | Yamada Gomachi |  |  |  |
| details genres | PASS | Romance, Comedy, School Life, Drama, Slice of Life, Shounen |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Masato, a first-year high school student who struggles to fit into his new school life, becomes intrigued by Rinko, the quiet girl sitting next to him who’s also always alone. One day, he happens to witness her secret training, and ends up helping her chase the kind of youthful high school life she’s always dreamed of.<br>https://www.cmoa.jp/.../345231<br><br>Alternative Titles:<br>- Inko Demo Seisyun Shitai<br>- インコでも青春したい<br>- 鹦鹉学唱青春之歌 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | PASS | 28 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://philiascans.org/.../68a1304b38199d1af434834c64e039d1c989712e958b05458567e9ce8a449b3b_s.webp <redacted query values: token, expires, and v>` (image/webp (encoding: lossy), 441836 bytes, 1351x1920) |  |  |  |
