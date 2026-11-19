# Extension Validation Report

- Extension: tachiyomi-ja.drecomics-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8766832343449907432
- Source name: DreComi+
- Source language: ja
- Selected manga input: popular offset 0: ブレイド＆バスタード (`.../CD00007`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | ブレイド＆バスタード (`.../CD00007`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | エリスの聖杯Ｓ (`.../CD00028`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | 婚約者が浮気相手と駆け落ちしました。王子殿下に溺愛されて幸せなので、今さら戻りたいと言われても困ります。 (`.../CD00003`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | 臼井くんはしのびない (`.../CD20001`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | ブレイド＆バスタード (`.../CD00007`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ブレイド＆バスタード (`.../CD00007`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 94 | 🔒 (Preview) ブレイド＆バスタード1 (`.../CD00007-001`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 52 |  |  | <1s |

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
| details description | PASS | 誰も踏み入れたことのない《迷宮》の奥で死体として発見され、蘇生されたものの記憶を失っていた男、イアルマス。<br>彼は単独で《迷宮》に潜っては、自らの「生前」を知るために、冒険者の死体を回収する日々を送っていた……。<br>そんな彼の灰塗れの日常は、残飯と呼ばれる少女剣士との出会いを機に動き始める――！<br>蝸牛くもが贈る、血と灰に塗れたダークファンタジー、開幕！<br><br>第1・第3金曜日<br><br>更新予定: 2026年12月4日(金) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 94 chapters |  |  |  |
| chapter dates | PASS | 94 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://cdn.drecomi-plus.jp/.../46de5a411e4d6103_0001.webp.enc` could not be downloaded: java.io.IOException: This service can only be used from Japan. | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
