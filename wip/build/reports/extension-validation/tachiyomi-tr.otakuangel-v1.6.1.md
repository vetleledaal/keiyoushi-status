# Extension Validation Report

- Extension: tachiyomi-tr.otakuangel-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 2
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2964530292665029215
- Source name: OtakuAngel
- Source language: tr
- Selected manga input: popular offset 0: One Punch Man (`.../393`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | One Punch Man (`.../393`) |  | <1s |
| popular_next | `getPopularManga(2)` | error | 0 |  | kotlinx.serialization.json.JsonDecodingException: Expected JsonArray, but had JsonLiteral as the serialized body of kotlin.collections.ArrayList at path: \$.altNames<br>JSON input: "" | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Odin’in Varisi (`.../2034`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Eşsiz Kule Rehberim (`.../2014`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | kotlinx.serialization.json.JsonDecodingException: Expected JsonArray, but had JsonLiteral as the serialized body of kotlin.collections.ArrayList at path: \$.altNames<br>JSON input: "" | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Punch Man (`.../393`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 332 | Bölüm 1 (`.../1-bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 21 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | ERROR | kotlinx.serialization.json.JsonDecodingException: Expected JsonArray, but had JsonLiteral as the serialized body of kotlin.collections.ArrayList at path: \$.altNames<br>JSON input: "" | REVIEW | INSUFFICIENT_EVIDENCE |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | kotlinx.serialization.json.JsonDecodingException: Expected JsonArray, but had JsonLiteral as the serialized body of kotlin.collections.ArrayList at path: \$.altNames<br>JSON input: "" | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | SKIP | Expected JsonArray, but had JsonLiteral as the serialized body of kotlin.collections.ArrayList at path: \$.altNames<br>JSON input: "" |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Expected JsonArray, but had JsonLiteral as the serialized body of kotlin.collections.ArrayList at path: \$.altNames<br>JSON input: "" |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://angel.cdnotakuangel.com/.../cover.jpg` (image/jpeg, 174527 bytes, 700x1077; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `393` |  |  |  |
| details thumbnail URL | PASS | `https://angel.cdnotakuangel.com/.../cover.jpg` |  |  |  |
| details author | PASS | ONE / Murata Yuusuke |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aksiyon, Macera, Bilim Kurgu, Seinen, Doğaüstü, Komedi, Dram, Süper Kahramanlar, Yaratık, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Üç yıl boyunca sıkı bir şekilde antrenman yaptıktan sonra, sıradan biri olan Saitama, herhangi birini ve her şeyi tek yumrukla alt edebilecek inanılmaz bir güce kavuşur. Yeni yeteneğini iyi bir amaç için kullanmaya karar verir ve bir kahraman olur. Ancak, canavarları kolayca yenmekten sıkılır ve kahraman olmanın heyecanını yeniden kazanmak için kendisine gerçek bir meydan okuyucu aramaya başlar.<br><br>Saitama'nın muazzam gücüne tanık olan cyborg Genos, onun öğrencisi olmaya kararlıdır. Bu süreçte Saitama, halk tarafından tanınmadığını ve hak ettiği itibarı göremediğini fark eder; çünkü Kahramanlar Derneği'ne kayıtlı değildir. Ününü artırmak isteyen Saitama, Genos'u kendisiyle birlikte derneğe kaydolmaya ikna eder; karşılığında onu öğrencisi olarak kabul eder. İkili, birlikte gerçek birer kahraman olma yolunda ilerlemeye başlar; amaçları hem güçlü düşmanlarla karşılaşmak hem de hak ettikleri saygıyı kazanmaktır.<br><br>**Alternatif isimler:**<br>- One-Punch Man: Tek Yumruk<br>- 원펀맨 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 332 chapters |  |  |  |
| chapter dates | PASS | 332 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 21 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://angel.cdnotakuangel.com/.../1_3b3b7acb-6121-487b-adbf-986ce9dd1ea8.jpg` (image/jpeg, 154498 bytes, 997x1000; server Content-Type: image/webp) |  |  |  |
