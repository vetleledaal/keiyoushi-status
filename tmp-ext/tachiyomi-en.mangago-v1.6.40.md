# Extension Validation Report

- Extension: tachiyomi-en.mangago-v1.6.40
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source ID: 2470059397662084186
- Source name: Mangago
- Source language: en
- Selected manga input: popular offset 0: Cherry Blossoms After Winter (`.../cherry_blossoms_after_winter`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | Cherry Blossoms After Winter (`.../cherry_blossoms_after_winter`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 48 | How to Snag an Alpha (`.../how_to_chase_an_alpha`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 48 | Ballerino (`.../ballerino`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 48 | Jungle Juice (`.../jungle_juice`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Cherry Blossoms After Winter (`.../cherry_blossoms_after_winter`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Cherry Blossoms After Winter (Yaoi) (`.../cherry_blossoms_after_winter`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 197 | Ch.1 (`.../406861a166`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cherry Blossoms After Winter, URL=`.../cherry_blossoms_after_winter` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 193/193 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 193/193 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.mangapicgallery.com/.../rROHYYKHa8HlWy3U7kHm8eI5JAZfLBWBoYekEkCcx-BVB-N.png <redacted query values: 4>` (image/png, 93370 bytes, 200x289) |  |  |  |
| details identity | UNUSUAL | Details changed selected title Cherry Blossoms After Winter to Cherry Blossoms After Winter (Yaoi) |  |  |  |
| details thumbnail URL | PASS | `https://i0.mangapicgallery.com/.../rROHYYKHa8HlWy3U7kHm8eI5JAZfLBWBoYekEkCcx-BVB-N.png <redacted query values: 4>` |  |  |  |
| details author | PASS | Bamwoo |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | School Life, Drama, Romance, Webtoons, Yaoi |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The following content is intended for mature audiences and may contain sexual themes, gore, violence and/or strong language. Discretion is advised. From living under the same roof to then being classmates?! Ever since his parents passed away, Haebom has been living in Taesung’s house. And now, being a 12th grader, he enters the same class as Taesung, which makes the whole situation way more awkward. Living together 24/7, Taesung and Haebom's relationship is bound to change. Original webtoon: http://www.mrblue.com/.../detail.asp <redacted query values: pid><br><br>Alternative Names:<br>- 겨울 지나 벚꽃 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 197 chapters |  |  |  |
| chapter dates | PASS | 197 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://iweb6.mangapicgallery.com/.../252739c1f3abf9e8ab6b870588c743c0.jpeg` (image/jpeg, 142227 bytes, 720x884) |  |  |  |
