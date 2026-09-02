# Extension Validation Report

- Extension: tachiyomi-en.zazamanga-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1264036757248780997
- Source name: Zazamanga
- Source language: en
- Selected manga input: popular offset 0: Tales of Demons and Gods (`.../6513`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Tales of Demons and Gods (`.../6513`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Mizuki-senpai's Love Fortune-Telling (`.../98781`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Tales of Demons and Gods (`.../6513`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tales of Demons and Gods (`.../6513`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2127 | Chapter 0 (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 161 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tales of Demons and Gods, URL=`6513` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 27/27 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 27/27 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.zinmanga1.com/.../tales-of-demons-and-gods.webp` (image/webp (encoding: lossy), 18232 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `6513` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.zinmanga1.com/.../tales-of-demons-and-gods.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Tales of Demons and Gods pulls readers into its story with a mix of engaging plot and memorable moments. With over 557,016,771 views and a rating of 5/5, it has already built a strong following on ZazaManga.<br><br>The series is currently Ongoing, and each chapter gives readers something to look forward to, whether it is a surprising twist, an intense scene, or a moment that sticks in the mind. Tales of Demons and Gods keeps readers engaged and curious, making it easy to lose track of time while reading.<br><br>Nie Li became the strongest Demon Spiritualist and stood at the pinnacle of the martial world. However, he lost his life during the battle with the Sage-Emperor and six deity-ranked beasts. His soul was then brought back to when he was still 13 years old. At this point in his life, Nie Li was considered to be the most pathetic of his peers. However, with the vast knowledge he accumulated from his previous life (his future), he began becoming stronger faster than anyone could expect. He also decided to help those who died nobly in his previous life become stronger as well. Aiming to avert the future destruction of his home by demon beasts, and to avoid his previous fate of ending up destroyed, Nie Li fights to protect his lover, friends, family and fellow citizens who died in the beast assault or its aftermath. He also aims to destroy the so-called "sacred family," who will abandon their duty and betray the city.<br><br>Alternative Names: Cuentos de Demonios y Dioses Fortellinger om Demoner og Guder Tales of Demons and Gods TDG TODG Yaoshenji Yāo Shén Jì Yêu Thần Ký Клеймо Зловещего Духа Сказания о Демонах и Богах 요신기 妖神记 妖神记（全彩） |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2127 chapters |  |  |  |
| chapter dates | PASS | 2127 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `chapter-716` at offsets 77, 78, `chapter-715` at offsets 79, 80, `chapter-714` at offsets 81, 82, `chapter-713` at offsets 83, 84, `chapter-712` at offsets 85, 86, `chapter-711` at offsets 87, 88, `chapter-710` at offsets 89, 90, `chapter-709` at offsets 91, 92, `chapter-708` at offsets 93, 94, `chapter-707` at offsets 95, 96, `chapter-706` at offsets 97, 98, `chapter-705` at offsets 99, 100, `chapter-704` at offsets 101, 102, `chapter-703` at offsets 103, 104, `chapter-702` at offsets 105, 106, `chapter-701` at offsets 107, 108, `chapter-700` at offsets 109, 110, `chapter-699` at offsets 111, 112, `chapter-698` at offsets 113, 114, `chapter-697` at offsets 115, 116, `chapter-696` at offsets 117, 118, `chapter-695` at offsets 119, 120, `chapter-694` at offsets 121, 122, `chapter-693` at offsets 123, 124, `chapter-692` at offsets 125, 126, `chapter-691` at offsets 127, 128, `chapter-690` at offsets 129, 130, `chapter-689` at offsets 131, 132, `chapter-688` at offsets 133, 134, `chapter-687` at offsets 135, 136, `chapter-686` at offsets 137, 138, `chapter-685` at offsets 139, 140, `chapter-684` at offsets 141, 142, `chapter-683` at offsets 143, 144, `chapter-682` at offsets 145, 146, `chapter-681` at offsets 147, 148, `chapter-680` at offsets 149, 150, `chapter-679` at offsets 151, 152, `chapter-678` at offsets 153, 154, `chapter-677` at offsets 155, 156, `chapter-676` at offsets 157, 158, `chapter-675` at offsets 159, 160, `chapter-674` at offsets 161, 162, `chapter-673` at offsets 163, 164, `chapter-672` at offsets 165, 166, `chapter-671` at offsets 167, 168, `chapter-670` at offsets 169, 170, `chapter-669` at offsets 171, 172, `chapter-668` at offsets 173, 174, `chapter-667` at offsets 175, 176, `chapter-666` at offsets 177, 178, `chapter-665` at offsets 179, 180, `chapter-664` at offsets 181, 182, `chapter-663` at offsets 183, 184, `chapter-662` at offsets 185, 186, `chapter-661` at offsets 187, 188, `chapter-660` at offsets 189, 190, `chapter-659` at offsets 191, 192, `chapter-658` at offsets 193, 194, `chapter-657` at offsets 195, 196, `chapter-656` at offsets 197, 198, `chapter-655` at offsets 199, 200, `chapter-654` at offsets 201, 202, `chapter-653` at offsets 203, 204, `chapter-652` at offsets 205, 206, `chapter-651` at offsets 207, 208, `chapter-650` at offsets 209, 210, `chapter-649` at offsets 211, 212, `chapter-648` at offsets 213, 214, `chapter-647` at offsets 215, 216, `chapter-646` at offsets 217, 218, `chapter-645` at offsets 219, 220, `chapter-644` at offsets 221, 222, `chapter-643` at offsets 223, 224, `chapter-642` at offsets 225, 226, `chapter-641` at offsets 227, 228, `chapter-640` at offsets 229, 230, `chapter-639` at offsets 231, 232, `chapter-638` at offsets 233, 234, `chapter-637` at offsets 235, 236, `chapter-636` at offsets 237, 238, `chapter-635` at offsets 239, 240, `chapter-634` at offsets 241, 242, `chapter-633` at offsets 243, 244, `chapter-632` at offsets 245, 246, `chapter-631` at offsets 247, 248, `chapter-630` at offsets 249, 250, `chapter-629` at offsets 251, 252, `chapter-628` at offsets 253, 254, `chapter-627` at offsets 255, 256, `chapter-626` at offsets 257, 258, `chapter-625` at offsets 259, 260, `chapter-624` at offsets 261, 262, `chapter-623` at offsets 263, 264, `chapter-622` at offsets 265, 266, `chapter-621` at offsets 267, 268, `chapter-620` at offsets 269, 270, `chapter-619` at offsets 271, 272, `chapter-618` at offsets 273, 274, `chapter-617` at offsets 275, 276, `chapter-616` at offsets 277, 278, `chapter-615` at offsets 279, 280, `chapter-614` at offsets 281, 282, `chapter-613` at offsets 283, 284, `chapter-612` at offsets 285, 286, `chapter-611` at offsets 287, 288, `chapter-610` at offsets 289, 290, `chapter-609` at offsets 291, 292, `chapter-608` at offsets 293, 294, `chapter-607` at offsets 295, 296, `chapter-606` at offsets 297, 298, `chapter-605` at offsets 299, 300, `chapter-604` at offsets 301, 302, `chapter-603` at offsets 303, 304, `chapter-602` at offsets 305, 306, `chapter-601` at offsets 307, 308, `chapter-600` at offsets 309, 310, `chapter-599` at offsets 311, 312, `chapter-598` at offsets 313, 314, `chapter-597` at offsets 315, 316, `chapter-596` at offsets 317, 318, `chapter-595` at offsets 319, 320, `chapter-594` at offsets 321, 322, `chapter-593` at offsets 323, 324, `chapter-592` at offsets 325, 326, `chapter-591` at offsets 327, 328, `chapter-590` at offsets 329, 330, `chapter-589` at offsets 331, 332, `chapter-588` at offsets 333, 334, `chapter-587` at offsets 335, 336, `chapter-586` at offsets 337, 338, `chapter-585` at offsets 339, 340, `chapter-584` at offsets 341, 342, `chapter-583` at offsets 343, 344, `chapter-582` at offsets 345, 346, `chapter-581` at offsets 347, 348, `chapter-580` at offsets 349, 350, `chapter-579` at offsets 351, 352, `chapter-578` at offsets 353, 354, `chapter-577` at offsets 355, 356, `chapter-576` at offsets 357, 358, `chapter-575` at offsets 359, 360, `chapter-574` at offsets 361, 362, `chapter-573` at offsets 363, 364, `chapter-572` at offsets 365, 366, `chapter-571` at offsets 367, 368, `chapter-570` at offsets 369, 370, `chapter-569` at offsets 371, 372, `chapter-568` at offsets 373, 374, `chapter-567` at offsets 375, 376, `chapter-566` at offsets 377, 378, `chapter-565` at offsets 379, 380, `chapter-564` at offsets 381, 382, `chapter-563` at offsets 383, 384, `chapter-562` at offsets 385, 386, `chapter-527` at offsets 425, 426, `chapter-519` at offsets 457, 458, `chapter-518` at offsets 465, 466, `chapter-516` at offsets 474, 475 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 161 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.zinmanga1.com/.../0.webp` (image/webp (encoding: lossy), 71376 bytes, 1000x562) |  |  |  |
