# Extension Validation Report

- Extension: tachiyomi-en.valirscans-v1.6.24
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source theme: vinetheme
- Source ID: 9114028255622294379
- Source name: Valir Scans
- Source language: en
- Selected manga input: popular offset 0: Not Your Typical Reincarnation Story (`.../cmo4isxa800zu43qqu334obe6`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Not Your Typical Reincarnation Story (`.../cmo4isxa800zu43qqu334obe6`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | The Secretly Strong Child is Looking for Her Dad (`.../cmmzfr9fi000e74qqols3oist`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | I Just Want My Happy Ending! (`.../cmm190xso03bawqfl5ctfhwwx`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Mother's Contract Marriage (`.../cmttblmve0kw245qqmu3xu1dp`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Not Your Typical Reincarnation Story (`.../cmo4isxa800zu43qqu334obe6`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Not Your Typical Reincarnation Story (`.../cmo4isxa800zu43qqu334obe6`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 115 | Ch. 1 (`.../cmo6berw70003gtqq9vv5fzil`) |  | <1s |
| pages | `getPageList(chapter)` | success | 58 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Not Your Typical Reincarnation Story, URL=`cmo4isxa800zu43qqu334obe6` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://valirscans.org/.../cover-9a774e7dd51a9f2e7b548ed48ec9dfe9.webp` (image/webp (encoding: lossy), 806176 bytes, 2048x3072) |  |  |  |
| details identity | PASS | Details preserved selected URL `cmo4isxa800zu43qqu334obe6` |  |  |  |
| details thumbnail URL | PASS | `https://valirscans.org/.../cover-9a774e7dd51a9f2e7b548ed48ec9dfe9.webp` |  |  |  |
| details author | PASS | admins |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | MANHWA, KOREAN, Drama, Fantasy, Isekai, Josei, Mystery, Romance |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Not all villains are evil. When Suna Choi reincarnates as Edith Rigelhof, the villain from her favorite novel, she is determined to change Edith’s life around and treats everyone with kindness. Although she marries the handsome Killian Rudwick, he is madly in love with the original protagonist of the book and mistrusts Edith because she is from a rival family. Will her marriage survive the whirlwind of family feuds, love triangles, and more? Will Edith find her happy ending?<br><br>Rating: 9.383561643835616<br>Type: MANHWA<br>Origin: KOREAN<br><br>Alternative titles: <br>- 흔한 빙의물인 줄 알았다<br>- Edith - Keine gewöhnliche Wiedergeburt<br>- Heunhan Binguimurin Jul Aratda<br>- Heunhan Bing-uimul in Jul Aratda<br>- I Thought It Was a Common Isekai Story<br>- I Thought It Was a Common Transmigration<br>- I Thought It's a Common Possession<br>- I Thought It was a Common Possession<br>- Nie jest to typowa historia o reinkarnacji<br>- Not Your Typical Isekai Story<br>- Not Your Typical Transmigration Story<br>- Tôi Tưởng Đó Chỉ Là Tiểu Thuyết Trọng Sinh Bình Thường<br>- Una atípica historia de reencarnación<br>- Une réincarnation presque ordinaire<br>- Я думала, это общее достояние<br>- นึกว่าเป็นอิเซไคธรรมดา<br>- よくある令嬢転生だと思ったのに<br>- 以為只是普通的穿越<br>- 以为只是普通附身<br>- 根本不是普通的穿书 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 3 name, chapter 15 name |  |  |  |
| chapters | PASS | 115 chapters |  |  |  |
| chapter dates | PASS | 115 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 58 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.valirscans.org/.../p-a338e9d0-9255-4d3e-9f4a-bdf847754663.webp` (image/webp (encoding: lossy), 42442 bytes, 800x1440) |  |  |  |
