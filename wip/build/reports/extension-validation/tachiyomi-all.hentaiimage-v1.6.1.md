# Extension Validation Report

- Extension: tachiyomi-all.hentaiimage-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 3
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: hentaicosplayxxx
- Source ID: 8365811741007899719
- Source name: Hentai Image
- Source language: all
- Selected manga input: popular offset 0: [Academic Mass] [Erotic image] Hiroshi Shinozawa invited me with naughty black pantyhose ~ ♪ (`.../academic-mass-erotic-image-hiroshi-shinozawa-invited-me-with-naughty-black-pantyhose`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | [Academic Mass] [Erotic image] Hiroshi Shinozawa invited me with naughty black pantyhose ~ ♪ (`.../academic-mass-erotic-image-hiroshi-shinozawa-invited-me-with-naughty-black-pantyhose`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 32 | [Gridman Erotic Manga] Rikka Takarata is cornered into an alley by a perverted old man! Threatened with a backstreet alley rape as a joke, summoned and trained...! (`.../gridman-erotic-manga-rikka-takarata-is-cornered-into-an-alley-by-a-perverted-old-man-threatened-with-a-backstreet-alley-rape-as-a-joke-summoned-and-trained`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 32 | 20 erotic images that reveal the erotic charm of Precure (`.../20-erotic-images-that-reveal-the-erotic-charm-of-precure`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 32 | Please share a large number of erotic images of breast fondling, 20 images (`.../please-share-a-large-number-of-erotic-images-of-breast-fondling-20-images`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 12 | [Laughs] 00后邻家妹妹的淫荡反差性爱 realistic AI animated EP4 (41P) [AI Generated] (`.../laughs-00-realistic-ai-animated-ep4-41p-ai-generated`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Academic Mass] [Erotic image] Hiroshi Shinozawa invited me with naughty black pantyhose ~ ♪ (`.../academic-mass-erotic-image-hiroshi-shinozawa-invited-me-with-naughty-black-pantyhose`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../academic-mass-erotic-image-hiroshi-shinozawa-invited-me-with-naughty-black-pantyhose`) |  | <1s |
| pages | `getPageList(chapter)` | success | 18 |  |  | <1s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 32 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 4: title=\[Academic Mass\] \[Erotic image\] Hiroshi Shinozawa invited me with naughty black pantyhose ~ ♪, URL=`.../academic-mass-erotic-image-hiroshi-shinozawa-invited-me-with-naughty-black-pantyhose` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=\[Laughs\] 00后邻家妹妹的淫荡反差性爱 realistic AI animated EP4 (41P) \[AI Generated\], URL=`.../laughs-00-realistic-ai-animated-ep4-41p-ai-generated` at page 1 offset 20 and page 2 offset 20, title=My realistic AI animated 14 \[ai generated\], URL=`.../my-realistic-ai-animated-14-ai-generated` at page 1 offset 21 and page 2 offset 21, title=ShIneArt - Hanekawa Tsubasa \[AI Generated\], URL=`.../shineart-hanekawa-tsubasa-ai-generated` at page 1 offset 22 and page 2 offset 22, title=【stykg】Cos Collections (Animated Webp) \[AI Generated\], URL=`.../stykgcos-collections-animated-webp-ai-generated-4` at page 1 offset 23 and page 2 offset 23, title=Those who want to get nuzzled with erotic images of Demon Slayer gather!, URL=`.../those-who-want-to-get-nuzzled-with-erotic-images-of-demon-slayer-gather` at page 1 offsets 24, 28 and page 2 offsets 24, 28, title=Splashthomson Short Comic Compilation \[AI generated\], URL=`.../splashthomson-short-comic-compilation-ai-generated-5` at page 1 offsets 25, 29 and page 2 offsets 25, 29, title=Raven (DC) Small Brat BBC Gallery \[AI Generated - BlackedNeeko\] (REUPLOD), URL=`.../raven-dc-small-brat-bbc-gallery-ai-generated-blackedneeko-reuplod` at page 1 offsets 26, 30 and page 2 offsets 26, 30, title=\[Hentai BBC\] Overlord Albedo X BBC (Patreon) \[AI Generated\], URL=`.../hentai-bbc-overlord-albedo-x-bbc-patreon-ai-generated` at page 1 offsets 27, 31 and page 2 offsets 27, 31 |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=\[Laughs\] 00后邻家妹妹的淫荡反差性爱 realistic AI animated EP4 (41P) \[AI Generated\], URL=`.../laughs-00-realistic-ai-animated-ep4-41p-ai-generated` at page 1 offset 20 and page 2 offset 20, title=My realistic AI animated 14 \[ai generated\], URL=`.../my-realistic-ai-animated-14-ai-generated` at page 1 offset 21 and page 2 offset 21, title=ShIneArt - Hanekawa Tsubasa \[AI Generated\], URL=`.../shineart-hanekawa-tsubasa-ai-generated` at page 1 offset 22 and page 2 offset 22, title=【stykg】Cos Collections (Animated Webp) \[AI Generated\], URL=`.../stykgcos-collections-animated-webp-ai-generated-4` at page 1 offset 23 and page 2 offset 23, title=\[Academic Mass\] \[Erotic image\] Hiroshi Shinozawa invited me with naughty black pantyhose ~ ♪, URL=`.../academic-mass-erotic-image-hiroshi-shinozawa-invited-me-with-naughty-black-pantyhose` at page 1 offset 24 and page 2 offset 24, title=Another Me \[AI Generated\], URL=`.../another-me-ai-generated` at page 1 offset 25 and page 2 offset 25, title=(BBL) kaju \[AI Generated\], URL=`.../bbl-kaju-ai-generated` at page 1 offset 26 and page 2 offset 26, title=LoliSilver Misc Part 0020 \[AI Generated\], URL=`.../lolisilver-misc-part-0020-ai-generated` at page 1 offset 27 and page 2 offset 27, title=Erotic images of pee, URL=`.../erotic-images-of-pee-7` at page 1 offset 28 and page 2 offset 28, title=\[Pixiv\] Hyu !! (9402260), URL=`.../pixiv-hyu-9402260-1` at page 1 offset 29 and page 2 offset 29, title=I want to take a shot with piercings, URL=`.../i-want-to-take-a-shot-with-piercings` at page 1 offset 30 and page 2 offset 30, title=Perspective Girl \[AI Generated\], URL=`.../perspective-girl-ai-generated` at page 1 offset 31 and page 2 offset 31 |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 4 manga entries; Popular page 2 repeats 4 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 140/140 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 140/140 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static23.hentai-img.com/.../1.jpg` (image/jpeg, 5767 bytes, 160x160) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../academic-mass-erotic-image-hiroshi-shinozawa-invited-me-with-naughty-black-pantyhose` |  |  |  |
| details thumbnail URL | PASS | `https://static23.hentai-img.com/.../1.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Erotic pictures, Idol master, Imus, Academic Mass, Gakuen Idol Master, Hiroshi Shinozawa, Shinosawa Hiro, Erotic pictures, Idol master, Imus, Academic Mass, Gakuen Idol Master, Hiroshi Shinozawa, Shinosawa Hiro |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hentai-img.com/.../1` to `https://hentai-img.com/.../ranking` (1 redirects); popular: `https://hentai-img.com/.../1` to `https://hentai-img.com/.../search` (1 redirects); popular: `https://hentai-img.com/.../1` to `https://hentai-img.com/.../\[Academic+Mass\]+\[Erotic+image\]+Hiroshi+Shinozawa+invited+me+with+naughty+black+pantyhose+~+%E2%99%AA` (1 redirects) |  |  |  |
| page load | PASS | `https://static23.hentai-img.com/.../1.jpg` (image/jpeg, 41640 bytes, 700x700) |  |  |  |
