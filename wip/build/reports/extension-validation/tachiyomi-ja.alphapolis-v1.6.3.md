# Extension Validation Report

- Extension: tachiyomi-ja.alphapolis-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1943011614685426671
- Source name: Alphapolis
- Source language: ja
- Selected manga input: popular offset 0: 華麗に離縁してみせますわ！ (`.../36000493`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 華麗に離縁してみせますわ！ (`.../36000493`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 48 | 45歳のおっさん、異世界召喚に巻き込... (`.../166000820`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 48 | 断罪された当て馬王子と愛したがり黒... [R18] (`.../603000666`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 華麗に離縁してみせますわ！ (`.../36000493`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 華麗に離縁してみせますわ！ (`.../36000493`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 38 | 第1回 (`.../6285`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 38 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 48 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=華麗に離縁してみせますわ！, URL=`.../36000493` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 127/127 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 127/127 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-image.alphapolis.co.jp/.../670x300.webp` (image/webp (encoding: lossy), 92454 bytes, 670x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../36000493` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-image.alphapolis.co.jp/.../670x300.webp` |  |  |  |
| details author | PASS | 白乃いちじく |  |  |  |
| details artist | PASS | あばたも |  |  |  |
| details genres | PASS | ファンタジー, 異世界, 恋愛, 悪役令嬢, チート |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 恋人のいたエイドリアンと結婚したローザ。「お前ほど醜い女はいないな。興ざめだ」、初夜でそんな言葉を投げつけられたものの、ただ父の命令で嫁いだだけの彼女にはエイドリアンへの好意はこれっぽっちもない。一刻も早く父の管理下から逃れるべく、お金を貯めて離縁して自由を手に入れようと奮起する。一方で、掃除に炊事、子供の世話、畑仕事に剣技と、なんでもこなす一本芯の通ったローザにエイドリアンはだんだん惹かれていくが……。アルファポリス「第14回恋愛小説大賞」大賞受賞作が、待望のコミカライズ化！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 38 chapters |  |  |  |
| chapter dates | LINT | 33 of 38 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=33 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ot-image.alphapolis.co.jp/.../1080x1536.webp <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/webp (encoding: lossy), 881912 bytes, 1080x1536) |  |  |  |
