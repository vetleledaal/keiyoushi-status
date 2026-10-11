# Extension Validation Report

- Extension: tachiyomi-tr.mangaportali-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 26
- Lint: 0
- Warnings: 0
- Skipped: 10
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2022032978410218674
- Source name: Manga Portalı
- Source language: tr
- Selected manga input: popular offset 0: Solo Leveling (`.../solo-leveling`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Solo Leveling (`.../solo-leveling`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Efsanevi Başbüyücünün Dönüşü (`.../efsanevi-basbuyucunun-donusu`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Zombi Avcısı (`.../zombi-avcisi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Solo Leveling (`.../solo-leveling`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Solo Leveling: Ragnarok (`.../solo-leveling-ragnarok`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Solo Leveling (`.../solo-leveling`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | error | 0 |  | kotlinx.serialization.MissingFieldException: Field 'isEarlyAccessLocked' is required for type with serial name 'eu.kanade.tachiyomi.extension.tr.mangaportali.ChapterDto', but it was missing | 1-10s |
| pages | `getPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | ERROR | kotlinx.serialization.MissingFieldException: Field 'isEarlyAccessLocked' is required for type with serial name 'eu.kanade.tachiyomi.extension.tr.mangaportali.ChapterDto', but it was missing | REVIEW | INSUFFICIENT_EVIDENCE |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Solo Leveling, URL=`solo-leveling` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangaportali.com/.../series-solo-leveling-cover-1770046456648-4ba8ba5f.webp` (image/webp (encoding: lossy), 78330 bytes, 1200x1722) |  |  |  |
| details identity | PASS | Details preserved selected URL `solo-leveling` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.mangaportali.com/.../series-solo-leveling-cover-1770046456648-4ba8ba5f.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aksiyon, Aşırı Güçlü Karakter, Avcı, Büyü, Canavar, Sistem |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 10 yıl önce, gerçek dünyayı canavar dünyasıyla bağlayan “Kapı” açıldıktan sonra, sıradan insanlardan bazıları Kapı içinde canavar avlama gücü kazandı. Onlara “Avcılar” deniyor. Ancak, tüm Avcılar güçlü değil. Benim adım Sung Jin-Woo, bir E-rütbesi Avcısıyım. Ben, en zayıf zindanlarda hayatını riske atan biriyim, “Dünyanın En Zayıfı” olarak bilinenlerde… Sergileyecek hiçbir becerim olmadığı için, düşük seviyeli zindanlarda savaşarak gerekli parayı ancak zorlukla kazanıyorum… en azından D-rütbesindeki zindanların en zor zindanlarından birini bulana kadar! Sonunda, ölümü kabul ederken, aniden garip bir güç aldım, sadece benim görebileceğim bir görev günlüğü, sadece benim bildiğim bir seviye atlama sırrı! Eğer görevlerime uygun olarak eğitilir ve canavar avlarsam, seviyem yükselecekti. En zayıf Avcıdan en güçlü S-rütbeli Avcıya dönüşmek! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | SKIP | Chapters did not run successfully |  |  |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
