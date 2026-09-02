# Extension Validation Report

- Extension: tachiyomi-ja.tonarinoyoungjump-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 1
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5726629019734498294
- Source name: Tonari no Young Jump
- Source language: ja
- Selected manga input: popular offset 0: 魔王さまの金曜日 (`.../12207421984093802437`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 203 | 魔王さまの金曜日 (`.../12207421984093802437`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 魔王さまの金曜日 (`.../12207421984093802437`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 魔王さまの金曜日 (`.../12207421984093802437`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | [第1話] 魔王さまの金曜日 (`.../12207421984093802437`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 45 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 203 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=魔王さまの金曜日, URL=`.../12207421984093802437` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 204/204 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 204/204 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.tonarinoyj.jp%2Fpublic%2Fseries-thumbnail%2F12207421984080772880-b2b99ff50ba1093a1fa111303ce6799c%3F1787281576` (image/jpeg, 52042 bytes, 500x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../12207421984093802437` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-scissors.gigaviewer.com/.../https%3A%2F%2Fcdn-img.tonarinoyj.jp%2Fpublic%2Fseries-thumbnail%2F12207421984080772880-b2b99ff50ba1093a1fa111303ce6799c%3F1787281576` (image/jpeg, 78088 bytes, 484x484) |  |  |  |
| details author | PASS | リムコロ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | かつて勇者と戦いに敗れ、最後に発動した魔法の暴走によって魔界から現代日本へと突如飛ばされてしまった魔王。 現代の食べ物を摂ることにより先の戦いによってほとんどを失った魔力を効率よく回復することができた魔王は、再び魔界へと帰還する。 魔王として魔界に君臨しながらもたびたび日本へとお忍びで訪れ、簡単に手に入るコンビニ飯などを食べる日々をおくっていた。 そんなある日、偶然通りかかった繁華街の裏通りで数人の男に絡まれる女の子を助けることに。 助けてもらったお礼にと連れていかれたのは、落ち着いた雰囲気のおでん屋さんだった……。 マジメで堅物な「魔王さま」が退勤後、ホントにおいしいお酒とご飯、そしてそれを一緒に楽しむ仲間と出会っていく――。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-img.tonarinoyj.jp/.../12207421984093827859-56d34d2cd7d1c9ce718923ef626fd246` (image/jpeg, 271779 bytes, 800x1137) |  |  |  |
