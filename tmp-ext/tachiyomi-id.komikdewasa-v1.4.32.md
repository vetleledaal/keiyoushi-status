# Extension Validation Report

- Extension: tachiyomi-id.komikdewasa-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source ID: 8753851309776247979
- Source name: Komik Dewasak
- Source language: id
- Selected manga input: latest offset 0: Siswi yang jahat, bertubuh pendek, berdandan mencolok, serta bersikap manis sekaligus kejam. (`.../siswi-yang-jahat-bertubuh-pendek-berdandan-mencolok-serta-bersikap-manis-sekaligus-kejam`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Kebugaran Tanpa Sensor (`.../kebugaran-tanpa-sensor`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Terlahir Dengan Penis Besar (`.../terlahir-dengan-penis-besar`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Siswi yang jahat, bertubuh pendek, berdandan mencolok, serta bersikap manis sekaligus kejam. (`.../siswi-yang-jahat-bertubuh-pendek-berdandan-mencolok-serta-bersikap-manis-sekaligus-kejam`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Prostat Sensei Shiori (`.../prostat-sensei-shiori`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Siswi yang jahat, bertubuh pendek, berdandan mencolok, serta bersikap manis sekaligus kejam. (`.../siswi-yang-jahat-bertubuh-pendek-berdandan-mencolok-serta-bersikap-manis-sekaligus-kejam`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Siswi yang jahat, bertubuh pendek, berdandan mencolok, serta bersikap manis sekaligus kejam. (`.../siswi-yang-jahat-bertubuh-pendek-berdandan-mencolok-serta-bersikap-manis-sekaligus-kejam`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 01 (`.../siswi-yang-jahat-bertubuh-pendek-berdandan-mencolok-serta-bersikap-manis-sekaligus-kejam-chapter-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Siswi yang jahat, bertubuh pendek, berdandan mencolok, serta bersikap manis sekaligus kejam., URL=`.../siswi-yang-jahat-bertubuh-pendek-berdandan-mencolok-serta-bersikap-manis-sekaligus-kejam` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../thumbnail.webp <redacted query values: fit and ssl>` (image/jpeg, 13285 bytes, 160x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../siswi-yang-jahat-bertubuh-pendek-berdandan-mencolok-serta-bersikap-manis-sekaligus-kejam` |  |  |  |
| details thumbnail URL | PASS | `https://i2.wp.com/.../thumbnail.webp <redacted query values: fit and ssl>` |  |  |  |
| details author | PASS | mizore |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Big aas, Bigbreast, Blow job, Cheating, Femdom, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Aku sudah punya pacar, jadi aku tidak akan tergoda oleh rayuan muridku yang bertubuh pendek, berdada ukuran M, serta memiliki sifat jahil nan manja….<br><br>Alternative Names: 彼女がいるので邪悪な低身長Mカップ甘々イジワル教え子の誘惑には負けません。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | pages: `http://img2.linksaya.com/.../1.jpg` to `https://img2.linksaya.com/.../1.jpg` (1 redirects) |  |  |  |
| page load | PASS | `http://img2.linksaya.com/.../1.jpg` (image/jpeg, 46077 bytes, 723x459) |  |  |  |
