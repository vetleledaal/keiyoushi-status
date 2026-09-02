# Extension Validation Report

- Extension: tachiyomi-ja.asacomi-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6455606609436338494
- Source name: Asacomi
- Source language: ja
- Selected manga input: popular offset 0: 終末ゾンビキャンプ (`.../94913b670c483`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 終末ゾンビキャンプ (`.../94913b670c483`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | 猫を拾った話。 (`.../da8497824b617`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | ある設計士の忌録 (`.../be8c33aa38f8e`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 終末ゾンビキャンプ (`.../94913b670c483`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 終末ゾンビキャンプ (`.../94913b670c483`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 6 | 1話　週末から大惨事 (`.../10f60c932846b`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=終末ゾンビキャンプ, URL=`.../94913b670c483` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 77/77 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 77/77 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20260521143055619C364CF1E90FF0F67ADB93B60C05A55B9-lg.webp` (image/webp (container: extended), 54428 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../94913b670c483` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20260521143055619C364CF1E90FF0F67ADB93B60C05A55B9.png` (image/png, 4468317 bytes, 2560x1344) |  |  |  |
| details author | PASS | 山崎峰水 |  |  |  |
| details artist | PASS | 山崎峰水 |  |  |  |
| details genres | PASS | コミックZOTTO, ホラー |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 趣味のキャンプで北関東の山にこもっていたら、いつのまにか街にはゾンビがはびこり、都心が壊滅していた。下山したイラストレーター・トワは、まずは都心の自宅を目指す。しかし、社会インフラはすでに止まり、電車もバスも飲食店もコンビニも電気も水道も使用不可となっていた。徒歩での帰宅を決意した彼女は案の定、ゾンビの脅威や空腹に悩まされることに――。だが過酷な状況でも、食道楽のトワは現地調達で食料を確保しつつ、あくまで美味にこだわって勇往邁進。道中で出会った生存者らと関わりながら、いかに腹を満たして生き抜くのか……！？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://viewer.asacomi.jp/.../master-1779342100990-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 5, 14, 11, 15, 10, 1, 8, 12, 13, 2, 9, 6, 4, 3, 7\]` (image/jpeg, 1278438 bytes, 1732x2509) |  |  |  |
