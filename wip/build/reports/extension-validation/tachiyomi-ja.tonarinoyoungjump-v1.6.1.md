# Extension Validation Report

- Extension: tachiyomi-ja.tonarinoyoungjump-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 5726629019734498294
- Source name: Tonari no Young Jump
- Source language: ja
- Selected manga input: popular offset 0: 魔王さまの金曜日 (`.../12207421984080772880`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 203 | 魔王さまの金曜日 (`.../12207421984080772880`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 203 | 超人X (`.../3269754496306260262`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 魔王さまの金曜日 (`.../12207421984080772880`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 魔王さまの金曜日 (`.../12207421984080772880`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | [第1話] 魔王さまの金曜日 (`.../12207421984093802437`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 45 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 203 entries |  |  |  |
| latest listing | PASS | 203 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=魔王さまの金曜日, URL=`12207421984080772880` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 407/407 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 407/407 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.tonarinoyj.jp/.../12207421984080772880-b2b99ff50ba1093a1fa111303ce6799c <redacted query values: 1787281576>` (image/jpeg, 125899 bytes, 500x500) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421984080772880` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.tonarinoyj.jp/.../12207421984080772880-b2b99ff50ba1093a1fa111303ce6799c <redacted query values: 1787281576>` |  |  |  |
| details author | PASS | リムコロ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | かつて勇者と戦いに敗れ、最後に発動した魔法の暴走によって魔界から現代日本へと突如飛ばされてしまった魔王。<br><br>現代の食べ物を摂ることにより先の戦いによってほとんどを失った魔力を効率よく回復することができた魔王は、再び魔界へと帰還する。<br>魔王として魔界に君臨しながらもたびたび日本へとお忍びで訪れ、簡単に手に入るコンビニ飯などを食べる日々をおくっていた。<br><br>そんなある日、偶然通りかかった繁華街の裏通りで数人の男に絡まれる女の子を助けることに。<br>助けてもらったお礼にと連れていかれたのは、落ち着いた雰囲気のおでん屋さんだった……。<br><br>マジメで堅物な「魔王さま」が退勤後、ホントにおいしいお酒とご飯、そしてそれを一緒に楽しむ仲間と出会っていく――。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.tonarinoyj.jp/.../12207421984093827859-56d34d2cd7d1c9ce718923ef626fd246` (image/jpeg, 271779 bytes, 800x1137) |  |  |  |
