# Extension Validation Report

- Extension: tachiyomi-ja.booklistastudio-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 31
- Lint: 3
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 4993360009034397146
- Source name: Booklista Studio
- Source language: ja
- Selected manga input: popular offset 0: ハチミツとオニオン (`.../092b71536ec53`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | ハチミツとオニオン (`.../092b71536ec53`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 30 | 悪妃エリーゼは死にました (`.../416d7e1ee5e93`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | 完結 (`.../6970e811ddf0b`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ハチミツとオニオン (`.../092b71536ec53`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ハチミツとオニオン (`.../092b71536ec53`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 10 | 第1話 唯斗の秘密(1) (`.../c774c7de381be`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 57 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ハチミツとオニオン, URL=`.../092b71536ec53` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../202312150124479807B20F71E5AC0BBF2A14EF8347C005103-lg.webp` (image/webp (encoding: lossy), 24752 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../092b71536ec53` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../202312150124479807B20F71E5AC0BBF2A14EF8347C005103.png` (image/png, 1321939 bytes, 1280x672) |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「俺は、こいつらとは違う」<br>ある日突然、右耳が聞こえなくなってしまった高校生・唯斗（ゆいと）。<br>片耳難聴であることに劣等感を抱き、友達の前では聴こえるフリを続けていたが、クラスでも目立たない存在の優（すぐる）はそんな唯斗の秘密に気づいていてーー。<br>唯斗と優の絆を軸に、恋に友情に進路にと悩みながら成長していく高校生たちの思春期群像劇。<br>原作：佐倉真実<br>作画：千田純生<br>ネーム構成：田口囁一<br>キャラクター原案：春壱<br>監修：岡野由実（言語聴覚士／「きこいろ」片耳難聴のコミュニティ 代表） |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 10 chapters |  |  |  |
| chapter dates | PASS | 10 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.studio.booklista.co.jp/.../master-1666579873182-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 0, 14, 3, 5, 12, 8, 9, 7, 6, 10, 11, 13, 2, 1, 4\]` (image/jpeg, 396328 bytes, 760x2560) |  |  |  |
