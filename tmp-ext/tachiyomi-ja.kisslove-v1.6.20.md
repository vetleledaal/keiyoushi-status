# Extension Validation Report

- Extension: tachiyomi-ja.kisslove-v1.6.20
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6304246026723672697
- Source name: KissLove
- Source language: ja
- Selected manga input: popular offset 0: HAIIRO NO ASH: TEIKOKU KISHIDAN WO KUBI NI NATTA ORE WA DUNGEON TOSHI DE HAIIRO NO JINSEI WO HIKKURI KAESU (`.../haiiro-no-ash-teikoku-kishidan-wo-kubi-ni-natta-ore-wa-dungeon-toshi-de-haiiro-no-jinsei-wo-hikkuri-kaesu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | HAIIRO NO ASH: TEIKOKU KISHIDAN WO KUBI NI NATTA ORE WA DUNGEON TOSHI DE HAIIRO NO JINSEI WO HIKKURI KAESU (`.../haiiro-no-ash-teikoku-kishidan-wo-kubi-ni-natta-ore-wa-dungeon-toshi-de-haiiro-no-jinsei-wo-hikkuri-kaesu`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | KAMUYOMI NO MAIHITO (`.../kamuyomi-no-maihito`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | KIRAWARESHA NO AKUYAKU REISOKU NI TENSEI SHITA NO NI, NAZE KA MAWARI GA HANATTE OITE KURENAI (`.../kirawaresha-no-akuyaku-reisoku-ni-tensei-shita-no-ni-naze-ka-mawari-ga-hanatte-oite-kurenai`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | HAIIRO NO ASH: TEIKOKU KISHIDAN WO KUBI NI NATTA ORE WA DUNGEON TOSHI DE HAIIRO NO JINSEI WO HIKKURI KAESU (`.../haiiro-no-ash-teikoku-kishidan-wo-kubi-ni-natta-ore-wa-dungeon-toshi-de-haiiro-no-jinsei-wo-hikkuri-kaesu`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | HAIIRO NO ASH: TEIKOKU KISHIDAN WO KUBI NI NATTA ORE WA DUNGEON TOSHI DE HAIIRO NO JINSEI WO HIKKURI KAESU (`.../haiiro-no-ash-teikoku-kishidan-wo-kubi-ni-natta-ore-wa-dungeon-toshi-de-haiiro-no-jinsei-wo-hikkuri-kaesu`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 25 | Chapter 1.0 (`.../haiiro-no-ash-teikoku-kishidan-wo-kubi-ni-natta-ore-wa-dungeon-toshi-de-haiiro-no-jinsei-wo-hikkuri-kaesu-chapter-1.0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 48 |  |  | <1s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=HAIIRO NO ASH: TEIKOKU KISHIDAN WO KUBI NI NATTA ORE WA DUNGEON TOSHI DE HAIIRO NO JINSEI WO HIKKURI KAESU, URL=`haiiro-no-ash-teikoku-kishidan-wo-kubi-ni-natta-ore-wa-dungeon-toshi-de-haiiro-no-jinsei-wo-hikkuri-kaesu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 92/92 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 92/92 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://j4.jfimv2.xyz/.../haiiro-no-ash_6a96cbe60a765.jpg` (image/jpeg, 203850 bytes, 320x454) |  |  |  |
| details identity | PASS | Details preserved selected URL `haiiro-no-ash-teikoku-kishidan-wo-kubi-ni-natta-ore-wa-dungeon-toshi-de-haiiro-no-jinsei-wo-hikkuri-kaesu` |  |  |  |
| details thumbnail URL | PASS | `https://j4.jfimv2.xyz/.../haiiro-no-ash_6a96cbe60a765.jpg` |  |  |  |
| details author | PASS | Rokoshi TOUMO |  |  |  |
| details artist | PASS | Rokoshi TOUMO |  |  |  |
| details genres | PASS | Fantasy, Adventure, Romance, Comedy, Drama |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 帝国騎士団の一隊長を勤め、貴族の可愛い婚約者までいるという公私ともに順風満帆な生活を送っていたアッシュ。しかし、ある日急に騎士団の追放と婚約破棄を宣告されてしまう!?全てが嫌になったアッシュは新天地へ赴くことに―。 一方、アッシュのいなくなった帝国騎士団では彼を溺愛する後輩のウルカが目の色を変えて彼を追いかけようとしているのだった。灰色に染まってしまった人生をひっくり返すための物語が今、始まる―。<br><br>灰色のアッシュ ～帝国騎士団をクビになった俺はダンジョン都市で灰色の人生をひっくり返す～, Ash the Gray: Fired From the Imperial Knights, I'm Turning My Dull Life Around in the Dungeon City, 회색의 애쉬 ~제국 기사단에서 잘린 나는 던전 도시에서 회색빛 인생을 뒤집는다~, Ash de los Grises ~Fui despedido de los Caballeros Imperiales, así que le daré la vuelta a mi vida gris en la ciudad de las mazhoras~, Tro tàn của kẻ sắc xám ～Bị sa thải khỏi đoàn kỉ sĩ đế quốc, tôi lật ngược cuộc đời xám xịt tại thành phố ngục tối～, 灰色的亞許 ～被帝國騎士團開除的我，要在迷宮都市翻轉灰暗的人生～, Gray Ash: The Dismissed Knight Begins Anew in the Dungeon City |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 25 chapters |  |  |  |
| chapter dates | PASS | 25 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://j1.jfimv2.xyz/.../837f9c8215852a0cbddb0bbdb6b700f1005.jpg` (image/jpeg, 603416 bytes, 1266x1800) |  |  |  |
