# Extension Validation Report

- Extension: tachiyomi-ja.drecomics-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 28
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 3
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8766832343449907432
- Source name: DreComi+
- Source language: ja
- Selected manga input: popular offset 0: ブレイド＆バスタード (`.../CD00007`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | ブレイド＆バスタード (`.../CD00007`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | 宰相補佐と黒騎士の契約結婚と離婚とその後 (`.../CD00017`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | 99回断罪されたループ令嬢ですが今世は「超絶愛されモード」ですって!? (`.../CD00001`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | ブレイド＆バスタード (`.../CD00007`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ブレイド＆バスタード (`.../CD00007`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | ブレイド＆バスタード (`.../CD00007`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 87 | 🔒 ブレイド＆バスタード1 (`.../CD00007-001`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ブレイド＆バスタード, URL=`CD00007` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://cdn.drecomi-plus.jp/.../3115cc439e0f9089.webp` could not be downloaded: java.io.IOException: This service can only be used from Japan. | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `CD00007` |  |  |  |
| details thumbnail URL | FAIL | Differs from selected listing thumbnail; Thumbnail URL `https://cdn.drecomi-plus.jp/.../16a36b2a59069e89.webp` could not be downloaded: java.io.IOException: This service can only be used from Japan. | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | 楓月 誠, 蝸牛くも, so-bin |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ファンタジー, バトル, シリアス, アクション, サスペンス, コミカライズ, アニメ化 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 誰も踏み入れたことのない《迷宮》の奥で死体として発見され、蘇生されたものの記憶を失っていた男、イアルマス。<br>彼は単独で《迷宮》に潜っては、自らの「生前」を知るために、冒険者の死体を回収する日々を送っていた……。<br>そんな彼の灰塗れの日常は、残飯と呼ばれる少女剣士との出会いを機に動き始める――！<br>蝸牛くもが贈る、血と灰に塗れたダークファンタジー、開幕！<br><br>第1・第3金曜日<br><br>更新予定: 2026年9月4日(金) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 87 chapters |  |  |  |
| chapter dates | LINT | All 87 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=87 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 401 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
