# Extension Validation Report

- Extension: tachiyomi-ja.klraw-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7433897302034602657
- Source name: KL Raw
- Source language: ja
- Selected manga input: popular offset 0: ブルーロック (`.../%E3%83%96%E3%83%AB%E3%83%BC%E3%83%AD%E3%83%83%E3%82%AF-raw`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 35 | ブルーロック (`.../%E3%83%96%E3%83%AB%E3%83%BC%E3%83%AD%E3%83%83%E3%82%AF-raw`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 35 | 羅城恋月夜 (`.../%E7%BE%85%E5%9F%8E%E6%81%8B%E6%9C%88%E5%A4%9C-raw`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 35 | せっかく農家に転生したので勇者は目指しません (`.../%E3%81%9B%E3%81%A3%E3%81%8B%E3%81%8F%E8%BE%B2%E5%AE%B6%E3%81%AB%E8%BB%A2%E7%94%9F%E3%81%97%E3%81%9F%E3%81%AE%E3%81%A7%E5%8B%87%E8%80%85%E3%81%AF%E7%9B%AE%E6%8C%87%E3%81%97%E3%81%BE%E3%81%9B%E3%82%93-raw`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 35 | 今夜は夜雀の屋台で (`.../%E4%BB%8A%E5%A4%9C%E3%81%AF%E5%A4%9C%E9%9B%80%E3%81%AE%E5%B1%8B%E5%8F%B0%E3%81%A7-raw`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | ブルーロック (`.../%E3%83%96%E3%83%AB%E3%83%BC%E3%83%AD%E3%83%83%E3%82%AF-raw`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ブルーロック (`.../%E3%83%96%E3%83%AB%E3%83%BC%E3%83%AD%E3%83%83%E3%82%AF-raw`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 363 | 第1話: 第1話 (`.../chapter-1-raw`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 78 |  |  | 1-10s |

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
| popular listing | PASS | 35 entries |  |  |  |
| latest listing | PASS | 35 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ブルーロック, URL=`.../%E3%83%96%E3%83%AB%E3%83%BC%E3%83%AD%E3%83%83%E3%82%AF-raw` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 143/143 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 143/143 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://imgjm.jmanga.ac/.../84ec0a9b14a4a9ce3c1ca2c86555b1c7.jpeg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../%E3%83%96%E3%83%AB%E3%83%BC%E3%83%AD%E3%83%83%E3%82%AF-raw` |  |  |  |
| details thumbnail URL | FAIL | Differs from selected listing thumbnail; Thumbnail URL `https://imgjm.jmanga.ac/.../84ec0a9b14a4a9ce3c1ca2c86555b1c7.jpeg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 404 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | 金城宗幸, ノ村優介 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | アニメ化, 広告掲載中, スポーツ, サッカー |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ブルーロック raw,ブルーロック zip,ブルーロック manga ２０１８年、W杯、日本代表ベスト１６敗退…。これを受け日本フットボール連合は、W杯優勝のため、３００人の高校生を集めた育成寮“青い監獄（ブルーロック）”を設立。コーチを務める男・絵心甚八は、日本に必要なのは「エゴイズムにあふれるストライカーだ」と断言。無名のFW・潔世一たちは、己をエゴイストに変える蹴落とし合いの選別に挑む！<br><br>Alternative Title: Blue Lock |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 363 chapters |  |  |  |
| chapter dates | LINT | All 363 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=363 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 78 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://sv1.freeimgmg.online/.../1.webp` (image/webp (encoding: lossy), 131518 bytes, 750x1080) |  |  |  |
