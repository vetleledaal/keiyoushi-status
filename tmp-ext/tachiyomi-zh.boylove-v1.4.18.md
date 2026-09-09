# Extension Validation Report

- Extension: tachiyomi-zh.boylove-v1.4.18
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

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1471112097704477289
- Source name: 香香腐宅
- Source language: zh
- Selected manga input: latest offset 0: 紧急！青春记录簿 (`.../32148`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | 无根树.../%E6%97%A0%E6%A0%B9%E4%B9%8B%E6%A0%91 (`.../16904`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 24 | 傲慢的圣托一世 (`.../14736`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | 紧急！青春记录簿 (`.../32148`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | Icing on the Cake【无码】 (`.../33702`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 紧急！青春记录簿 (`.../32148`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 紧急！青春记录簿 (`.../32148`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 42 | 第1话 (`.../2662867`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 39 |  |  | 1-10s |

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
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=紧急！青春记录簿, URL=`32148` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Icing on the Cake【无码】, URL=`33702` at page 1 offset 10 and page 2 offset 0, title=公共财爸爸【无码】, URL=`31087` at page 1 offset 11 and page 2 offset 1, title=冬缘【无码】, URL=`33005` at page 1 offset 12 and page 2 offset 2, title=恩宠之夜【无码】, URL=`32593` at page 1 offset 13 and page 2 offset 3, title=绝对复仇宣言【无码】, URL=`31159` at page 1 offset 14 and page 2 offset 4, title=祭品丈夫【无码】, URL=`30748` at page 1 offset 15 and page 2 offset 5, title=近距离邻居【无码】, URL=`33059` at page 1 offset 16 and page 2 offset 6, title=魔教主之妾的生存之道【无码】, URL=`29298` at page 1 offset 17 and page 2 offset 7 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blcnimghost2.cc/.../52de50a738a009c26a1937c32944dcc1.webp` (image/webp (encoding: lossy), 64328 bytes, 512x682) |  |  |  |
| details identity | PASS | Details preserved selected URL `32148` |  |  |  |
| details thumbnail URL | PASS | `https://blcnimghost2.cc/.../52de50a738a009c26a1937c32944dcc1.webp` |  |  |  |
| details author | PASS | 이삼호 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 韩漫, 校园, 学霸攻, 不良受 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 更新时间：2026-09-04 15:43:13<br><br>비상!청춘기록부<br>平台：ridibookS |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 42 chapters |  |  |  |
| chapter dates | PASS | 42 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.boylove.cc/.../2HChRt3qqa6OXAWxOIAbFYF5LphIR1Cpvnt.webp <redacted query values: w and scrambled_parts_count>` (image/jpeg, 186182 bytes, 650x2600; server Content-Type: image/webp) |  |  |  |
