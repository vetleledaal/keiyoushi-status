# Extension Validation Report

- Extension: tachiyomi-en.kitsunedawn-v1.6.26
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: keyoapp
- Source ID: 7739452864322240494
- Source name: Kitsune Dawn
- Source language: en
- Selected manga input: popular offset 0: Cursed to Get Hard Just Because You Call My Name: Drowning in the Hidden Sweetness of a Fated Knight (`.../8a90dcb4-2e51-4538-913a-197e63849ae5`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Cursed to Get Hard Just Because You Call My Name: Drowning in the Hidden Sweetness of a Fated Knight (`.../8a90dcb4-2e51-4538-913a-197e63849ae5`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | The Reincarnated Villainess Became the Tyrant's Drinking Buddy, but She Accidentally Crossed the Line, So She'll Be Taking Her Leave! (`.../00621ee1-3bc2-4465-8fd3-9f202cfbebd4`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Older Yakuza Is a Pure-Hearted Beast: Stop Acting Like My Guardian Just Because You're a Yakuza (`.../58560e62-1764-42bf-a344-3cebf0157c06`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | I Want to See My Doting Boyfriend's Cute Face Too Much (`.../f83935c6-6464-4f40-86c3-7ecc8670fe29`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Cursed to Get Hard Just Because You Call My Name: Drowning in the Hidden Sweetness of a Fated Knight (`.../8a90dcb4-2e51-4538-913a-197e63849ae5`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Cursed to Get Hard Just Because You Call My Name: Drowning in the Hidden Sweetness of a Fated Knight (`.../8a90dcb4-2e51-4538-913a-197e63849ae5`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | Chapter 01 (`.../dc688e76-d862-489d-83e7-9f5fad0501d7`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | <1s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cursed to Get Hard Just Because You Call My Name: Drowning in the Hidden Sweetness of a Fated Knight, URL=`.../8a90dcb4-2e51-4538-913a-197e63849ae5` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 89/89 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 89/89 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.kitsunedawn.com/.../300x450.webp` (image/webp (encoding: lossy), 41000 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../8a90dcb4-2e51-4538-913a-197e63849ae5` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.kitsunedawn.com/.../600x900.webp` (image/webp (encoding: lossy), 106458 bytes, 600x900) |  |  |  |
| details author | PASS | Kazusa Nanami (七海かずさ), Hisashi Asagishi (浅岸久) |  |  |  |
| details artist | PASS | Kazusa Nanami (七海かずさ), Hisashi Asagishi (浅岸久) |  |  |  |
| details genres | PASS | Japanese, Fantasy, Romance, TL Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Aletta is a witch who spends her days buried in magical research, so absorbed in her work that those around her whisper about her as "the gloomy Aletta." Then one day, Diederik—a knight hailed as the nation's great hero after countless victories over monsters—arrives at her laboratory. Without warning, he declares that he has been cursed to become aroused whenever she calls his name. Aletta is stunned, but she has no memory of casting any such spell. Unconvinced, Diederik pins her down and demands that she endure the same humiliation until she confesses, pressing her for the truth with his body. Each time his tongue teases and torments her most embarrassing places, Aletta keeps trembling through climax after climax. Why would merely calling his name make him hard? The great hero knight and the witch are drawn into an otherworldly romance of revelation.<br><br>Alternative Titles:<br>- 君に名前を呼ばれるだけで勃起する呪いをかけられた～因縁騎士の隠れ重甘に溺れていく<br>- Kimi ni Namae o Yobareru Dake de Bokki suru Noroi o Kakerareta ~Innen Kishi no Kakure Juama ni Oboreteiku |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.kitsunedawn.com/.../001.jpg` (image/jpeg, 664725 bytes, 1254x1123) |  |  |  |
