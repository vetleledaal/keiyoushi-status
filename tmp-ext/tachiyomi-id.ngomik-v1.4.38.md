# Extension Validation Report

- Extension: tachiyomi-id.ngomik-v1.4.38
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 5360960267485387879
- Source name: Ngomik (unoriginal)
- Source language: id
- Selected manga input: latest offset 0: The Tutorial Is Too Hard (`.../the-tutorial-is-too-hard`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 22 | Magic Emperor (`.../magic-emperor`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 22 | The Return of the Disaster-Class Hero (`.../the-return-of-the-disaster-class-hero`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 22 | The Tutorial Is Too Hard (`.../the-tutorial-is-too-hard`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 22 | Return of the Adopted Child in a World of Bloodline Supremacy (`.../return-of-the-adopted-child-in-a-world-of-bloodline-supremacy`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Tutorial Is Too Hard (`.../the-tutorial-is-too-hard`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Tutorial Is Too Hard (`.../the-tutorial-is-too-hard`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 288 | Chapter 0 (`.../the-tutorial-is-too-hard-chapter-00`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 33 |  |  | 1-10s |

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
| popular listing | PASS | 22 entries |  |  |  |
| latest listing | PASS | 22 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Tutorial Is Too Hard, URL=`.../the-tutorial-is-too-hard` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.bid-cdn.cloud/.../image-e1724759313373.webp` (image/webp (encoding: lossy), 52982 bytes, 384x522) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-tutorial-is-too-hard` |  |  |  |
| details thumbnail URL | PASS | `https://cover.bid-cdn.cloud/.../image-e1724759313373.webp` |  |  |  |
| details author | PASS | Gandara |  |  |  |
| details artist | PASS | Imae Daiki |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Psychological, Supernatural, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Lee Hojae telah menyerahkan hidupnya sebagai seorang gamer profesional, hingga suatu hari ia menerima sebuah pesan misterius: “Selamat! Anda telah diundang ke Dunia Tutorial.” Karena penasaran, dia memasuki permainan dan dengan percaya diri memilih tingkat kesulitan “neraka”, tetapi segera mengetahui bahwa dia terjebak di sana. Dengan tingkat kelangsungan hidup hanya 0,01%, Hojae harus mengatasi tantangan yang menyiksa dalam game ini untuk mengetahui alasan sebenarnya dia diundang. Tutorial ini mungkin sulit, tetapi rahasianya adalah apa yang benar-benar mengerikan.<br><br>Alternative Names: The Tutorial Is Too Tough!, The Tutorial Is Too Hard, チュートリアルが死ぬほど難しい, 新手关卡太难了, 新手教學有夠難, 튜토리얼이 너무 어렵다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 288 chapters |  |  |  |
| chapter dates | LINT | 252 of 288 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=252 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://02.ngomik.cc/.../manga <redacted query values: page and order>` to `https://02.ngomik.cc/.../manga <redacted query values: page and order>` (1 redirects); popular_next: `https://02.ngomik.cc/.../manga <redacted query values: page and order>` to `https://02.ngomik.cc/.../manga <redacted query values: page and order>` (1 redirects); latest: `https://02.ngomik.cc/.../manga <redacted query values: page and order>` to `https://02.ngomik.cc/.../manga <redacted query values: page and order>` (1 redirects); latest_next: `https://02.ngomik.cc/.../manga <redacted query values: page and order>` to `https://02.ngomik.cc/.../manga <redacted query values: page and order>` (1 redirects); search: `https://02.ngomik.cc/.../manga <redacted query values: page, title, author, yearx, status, type, and order>` to `https://02.ngomik.cc/.../manga <redacted query values: page, title, author, yearx, status, type, and order>` (1 redirects) |  |  |  |
| page load | PASS | `https://srvr1.bid-cdn.cloud/.../01.webp` (image/webp (container: extended), 55846 bytes, 800x428) |  |  |  |
